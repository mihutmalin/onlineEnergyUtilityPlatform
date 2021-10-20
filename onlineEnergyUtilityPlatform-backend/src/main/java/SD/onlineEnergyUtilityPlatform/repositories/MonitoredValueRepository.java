package SD.onlineEnergyUtilityPlatform.repositories;

import SD.onlineEnergyUtilityPlatform.entities.MonitoredValue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MonitoredValueRepository extends JpaRepository<MonitoredValue, UUID> {
}
