package SD.onlineEnergyUtilityPlatform.services;

import SD.onlineEnergyUtilityPlatform.repositories.MonitoredValueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MonitoredValueService {
    private final MonitoredValueRepository monitoredValueRepository;
}
