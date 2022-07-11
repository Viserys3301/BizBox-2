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

    public List<psPatitem> findByPatientId(Integer patientId){
        Map<Integer, ArrayList<psPatitem>> ambulatories = new HashMap<>();
        ArrayList<Integer> ambulatory = new ArrayList<>();
        List<psPatitem> list = patitemRepository.findByPatientId(patientId);

        Integer key = null;

        for (psPatitem p:list) {
            ambulatory.add(p.getFK_psPatRegisters());
        }

        Set<Integer> set = new HashSet<>(ambulatory);
        ambulatory.clear();
        ambulatory.addAll(set);

        //TODO На основе списка ambulatory создать амбулатории

        return null;
    }
}
