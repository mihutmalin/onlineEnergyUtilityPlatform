package SD.onlineEnergyUtilityPlatform.dtos;

import SD.onlineEnergyUtilityPlatform.entities.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.RepresentationModel;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientDTO extends RepresentationModel<ClientDTO> {
    private UUID id;
    private String name;
    private String address;
    private Date birthDate;
    private User user;
}
