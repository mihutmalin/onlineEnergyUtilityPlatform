package SD.onlineEnergyUtilityPlatform.services;

import SD.onlineEnergyUtilityPlatform.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
}
