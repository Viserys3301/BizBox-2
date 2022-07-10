package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.entities.manipulation.DatacenterPatient;
import kz.healthcity.medbox.repositories.manipulation.DatacenterPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class DatacenterService {
    DatacenterPatientRepository datacenterRepository;


    @Autowired
    public void setDatacenterRepository(DatacenterPatientRepository datacenterRepository) {
        this.datacenterRepository = datacenterRepository;
    }


    public List<DatacenterPatient> findTop31ByOrderByFullname() {
        return datacenterRepository.findTop31ByOrderByFullname();
    }


}
