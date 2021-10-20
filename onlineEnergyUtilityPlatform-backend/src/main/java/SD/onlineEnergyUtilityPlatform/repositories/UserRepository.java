package SD.onlineEnergyUtilityPlatform.repositories;

import SD.onlineEnergyUtilityPlatform.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
