package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.entities.manipulation.psPatLedgers;
import kz.healthcity.medbox.repositories.manipulation.psPatLedgersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.NotActiveException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

@Service
public class PatLedgersService {
    psPatLedgersRepository patLedgersRepository;

    WarehouseService warehouseService;

    @Autowired
    public void setWarehouseService(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @Autowired
    public void setPatLedgersRepository(psPatLedgersRepository patLedgersRepository) {
        this.patLedgersRepository = patLedgersRepository;
    }

    public psPatLedgers findById(Long id){
        return patLedgersRepository.findById(id).get();
    }

    @Transactional
    public void update(psPatLedgers patLedgers){
        patLedgersRepository.save(patLedgers);
    }




    public List<psPatLedgers> findAll() {
        return patLedgersRepository.findAll();
    }

    public List<psPatLedgers> findByPatRegisters(Integer patRegisters){
        List<psPatLedgers> list = patLedgersRepository.findByPatRegisters(patRegisters);



        return list;
    }


    public void update(Long innerId){
        patLedgersRepository.update(innerId);
    }
}
