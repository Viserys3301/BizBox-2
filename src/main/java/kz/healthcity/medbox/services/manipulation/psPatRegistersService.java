package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.entities.manipulation.PatRegisters;
import kz.healthcity.medbox.repositories.manipulation.PatRegistersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class psPatRegistersService {

    PatRegistersRepository patRegistersRepository;

    @Autowired
    public void setPatRegistersRepository(PatRegistersRepository patRegistersRepository) {
        this.patRegistersRepository = patRegistersRepository;
    }

    public Optional<PatRegisters> findById(Integer id){
        return patRegistersRepository.findById(id);
    }

    @Transactional
    public void update(PatRegisters patRegisters){
        patRegistersRepository.save(patRegisters);
    }

    public List<PatRegisters> findByPatientId(Integer patientId){


        List<PatRegisters> list = patRegistersRepository.findByPatientId(patientId);


        return list;
    }
}
