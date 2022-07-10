package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.entities.manipulation.AGP;
import kz.healthcity.medbox.repositories.manipulation.AGPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AGPService {
    AGPRepository agpRepository;

    @Autowired
    public void setAgpRepository(AGPRepository agpRepository) {
        this.agpRepository = agpRepository;
    }

    public List<AGP> findAll(){
        System.out.println(agpRepository.findAll());

        return null;
    }
}
