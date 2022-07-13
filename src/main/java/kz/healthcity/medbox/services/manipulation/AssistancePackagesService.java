package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.entities.manipulation.corp.AssistancePackages;
import kz.healthcity.medbox.repositories.manipulation.AssistancePackagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssistancePackagesService {

    AssistancePackagesRepository assistancePackagesRepository;

    @Autowired
    public void setAssistancePackagesRepository(AssistancePackagesRepository assistancePackagesRepository) {
        this.assistancePackagesRepository = assistancePackagesRepository;
    }

    public String getNameById(Integer id){
        AssistancePackages packages = assistancePackagesRepository.findById(id).get();
        return packages.getName();
    }
}
