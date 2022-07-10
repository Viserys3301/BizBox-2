package kz.healthcity.medbox.services.bonus_system;

import kz.healthcity.medbox.entities.manipulation.psPatLedgers;
import kz.healthcity.medbox.services.manipulation.psPatLedgersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class FindNewBonusPatientService {

    psPatLedgersService PatLedgersService;

    @Autowired
    public void setPatLedgersService(psPatLedgersService patLedgersService) {
        PatLedgersService = patLedgersService;
    }

    Timestamp timestampStart;
    Timestamp timestampEnd;

    SimpleDateFormat simpleDateFormatAM = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");


    public void find(){
        timestampStart = Timestamp.valueOf(LocalDateTime.now().minusDays(2));
        timestampEnd = Timestamp.valueOf(LocalDateTime.now());


       // List<psPatLedgers> payments = PatLedgersService.findByDateTime(timestampStart,timestampEnd);



            psPatLedgers  all = PatLedgersService.findById(346441L);
            System.out.println(all);





        // List<psPatLedgers> payments = PatLedgersService.findAll();
        System.out.println(timestampStart);
        System.out.println(timestampEnd);

    }



}
