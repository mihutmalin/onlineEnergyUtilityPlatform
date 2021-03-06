package SD.onlineEnergyUtilityPlatform.repositories;

import SD.onlineEnergyUtilityPlatform.entities.Device;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeviceRepository extends JpaRepository<Device, UUID> {
}
