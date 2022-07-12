package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.entities.manipulation.psPatinv;
import kz.healthcity.medbox.repositories.manipulation.psPatinvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class psPatinvService {
    psPatinvRepository patinvRepository;

    @Autowired
    public void setPatinvRepository(psPatinvRepository patinvRepository) {
        this.patinvRepository = patinvRepository;
    }

    public Optional<psPatinv> findById(Long id){
        return patinvRepository.findById(id);
    }



    public void update(Long innerId){
      patinvRepository.update(innerId);
    }

}
