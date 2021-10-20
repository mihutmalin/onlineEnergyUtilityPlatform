package SD.onlineEnergyUtilityPlatform.repositories;


import SD.onlineEnergyUtilityPlatform.entities.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SensorRepository extends JpaRepository<Sensor, UUID> {
}
