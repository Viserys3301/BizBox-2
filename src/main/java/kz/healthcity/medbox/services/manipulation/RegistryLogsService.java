package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.entities.manipulation.RegistryLogs;
import kz.healthcity.medbox.repositories.manipulation.RegistryLogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistryLogsService {
    RegistryLogsRepository registryLogsRepository;

    @Autowired
    public void setRegistryLogsRepository(RegistryLogsRepository registryLogsRepository) {
        this.registryLogsRepository = registryLogsRepository;
    }

    public List<RegistryLogs> findTop31ByOrderByID(){
        return registryLogsRepository.findTop31ByOrderByID();
    }
}
