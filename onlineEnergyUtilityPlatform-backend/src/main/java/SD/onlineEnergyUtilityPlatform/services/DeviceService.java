package SD.onlineEnergyUtilityPlatform.services;

import SD.onlineEnergyUtilityPlatform.repositories.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeviceService {
    private final DeviceRepository deviceRepository;
}
