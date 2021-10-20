package SD.onlineEnergyUtilityPlatform.controllers;

import SD.onlineEnergyUtilityPlatform.dtos.ClientDTO;
import SD.onlineEnergyUtilityPlatform.services.ClientService;
import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    @PostMapping("/clients")
    public ClientDTO create(@RequestBody ClientDTO clientDTO) {
        return clientService.create(clientDTO);
    }

    @PutMapping("/clients/{id}")
    public ClientDTO update(@PathVariable UUID id, @RequestBody ClientDTO clientDTO) throws NotFoundException {
        return clientService.update(id,clientDTO);
    }

    @DeleteMapping("/clients/{id}")
    public void delete(@PathVariable UUID id) {
        clientService.delete(id);
    }

    @GetMapping("/clients/{id}")
    public ClientDTO getById(@PathVariable UUID id) throws NotFoundException {
        return clientService.getById(id);
    }

    @GetMapping("/clients")
    public List<ClientDTO> getAll() {
        return clientService.getAll();
    }
}
