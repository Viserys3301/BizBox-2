package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.entities.manipulation.DatacenterPatient;
import kz.healthcity.medbox.repositories.manipulation.DatacenterPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public Page<DatacenterPatient> findAll() {
        return datacenterRepository.findAll(PageRequest.of(2,3));
    }

    String findClientNameById(Long id){
        DatacenterPatient patient = datacenterRepository.findById(id).get();
        return patient.getFullname();
    }


    @Transactional
    public List<DatacenterPatient> findByFullnameLike(String name){

        if (!name.contains("%")){
            name =String.join("","%",name,"%");
        }

        return datacenterRepository.findByFullnameLike(name);
    }

    public String findNameById(Long id){
        DatacenterPatient doctor = datacenterRepository.findById(id).get();
        return doctor.getFullname();
    }

}
