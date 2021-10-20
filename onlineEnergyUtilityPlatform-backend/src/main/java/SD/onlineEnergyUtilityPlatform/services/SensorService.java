package SD.onlineEnergyUtilityPlatform.services;

import SD.onlineEnergyUtilityPlatform.repositories.SensorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SensorService {
    private final SensorRepository sensorRepository;
}
