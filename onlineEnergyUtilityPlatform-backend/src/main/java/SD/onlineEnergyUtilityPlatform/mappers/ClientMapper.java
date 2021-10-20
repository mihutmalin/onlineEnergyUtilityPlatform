package SD.onlineEnergyUtilityPlatform.mappers;

import SD.onlineEnergyUtilityPlatform.dtos.ClientDTO;
import SD.onlineEnergyUtilityPlatform.entities.Client;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ClientMapper {
    public ClientDTO convertClientToClientDTO(Client client){
        return ClientDTO.builder()
                .id(client.getId())
                .name(client.getName())
                .address(client.getAddress())
                .birthDate(client.getBirthDate())
                .user(client.getUser())
               .build();
    }

    public Client convertClientDTOToClient(ClientDTO client){
        return Client.builder()
                .id(client.getId())
                .name(client.getName())
                .address(client.getAddress())
                .birthDate(client.getBirthDate())
                .user(client.getUser())
                .build();
    }
}
