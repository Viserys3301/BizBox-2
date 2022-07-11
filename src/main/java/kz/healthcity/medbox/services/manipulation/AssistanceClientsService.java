package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.entities.manipulation.corp.Assistance_clients;
import kz.healthcity.medbox.repositories.manipulation.AssistanceClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssistanceClientsService {
    AssistanceClientsRepository  assistanceClientsRepository;

    @Autowired
    public void setAssistanceClientsRepository(AssistanceClientsRepository assistanceClientsRepository) {
        this.assistanceClientsRepository = assistanceClientsRepository;
    }

    public List<Assistance_clients> findAll(){
        System.out.println(assistanceClientsRepository.findAll());
        return assistanceClientsRepository.findAll();
    }

    public String findNameById(Integer id){
        Assistance_clients clients = assistanceClientsRepository.findById(id).get();
        return clients.getName();
    }
    public String findPackageNameById(Integer id){
        Assistance_clients clients = assistanceClientsRepository.findById(id).get();
        return clients.getAbbrName();
    }
}
