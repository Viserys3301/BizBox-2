package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.entities.manipulation.psPatitem;
import kz.healthcity.medbox.repositories.manipulation.psPatitemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class psPatitemService {

    psPatitemRepository patitemRepository;

    @Autowired
    public void setPatitemRepository(psPatitemRepository patitemRepository) {
        this.patitemRepository = patitemRepository;
    }

    public Optional<psPatitem> findById(Integer id){
        return patitemRepository.findById(id);
    }

    @Transactional
    public void update(psPatitem patitem){
        patitemRepository.save(patitem);
    }

    public Map<Integer,List<psPatitem>> findByPatientId(Integer patientId){
        Map<Integer, List<psPatitem>> ambulatories = new HashMap<>();


        List<psPatitem> list = patitemRepository.findByPatientId(patientId);

        for (psPatitem p:list) {
            ambulatories.put(p.getFK_psPatRegisters(),patitemRepository.findByInnerId(p.getInnerId()));
        }

        //TODO ДОДУШИТЬ ПОМЕНЯТЬ СУЩНОСТЬ НА PS PAT REG

        return ambulatories;
    }
}
