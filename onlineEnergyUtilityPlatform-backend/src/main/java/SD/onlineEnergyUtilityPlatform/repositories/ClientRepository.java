package SD.onlineEnergyUtilityPlatform.repositories;

import SD.onlineEnergyUtilityPlatform.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {
    /**
     * Example: JPA generate Query by Field
     */
    List<Client> findByName(String name);

    /**
     * Example: Write Custom Query
     */
    /*
    @Query(value = "SELECT p " +
            "FROM Client p " +
            "WHERE p.name = :name " +
            "AND p.age >= 60  ")
    Optional<Client> findSeniorsByName(@Param("name") String name);
     */
}
