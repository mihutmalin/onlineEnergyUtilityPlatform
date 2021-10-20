package SD.onlineEnergyUtilityPlatform.services;

import SD.onlineEnergyUtilityPlatform.dtos.ClientDTO;
import SD.onlineEnergyUtilityPlatform.mappers.ClientMapper;
import SD.onlineEnergyUtilityPlatform.repositories.ClientRepository;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientDTO create(ClientDTO clientDTO){
        clientRepository.save(ClientMapper.convertClientDTOToClient(clientDTO));
        return clientDTO;
    }

    public ClientDTO update(UUID id, ClientDTO clientDTO) throws NotFoundException {
        clientRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("The client with id:" + id.toString() + " not found"));
        clientRepository.save(ClientMapper.convertClientDTOToClient(clientDTO));
        return clientDTO;
    }

    public void delete(UUID id){
        clientRepository.deleteById(id);
    }

    public ClientDTO getById(UUID id) throws NotFoundException {
        if(clientRepository.findById(id).isPresent()){
            return ClientMapper.convertClientToClientDTO(clientRepository.findById(id).get());
        }
        else{
            throw new NotFoundException("The client with id:" + id.toString() + " not found");
        }
    }

    public List<ClientDTO> getAll() {
        System.out.println(clientRepository.findAll());
        return clientRepository
                .findAll()
                .stream()
                .map(ClientMapper::convertClientToClientDTO)
                .collect(Collectors.toList());
    }
}
