package kz.healthcity.medbox.services.bonus_system;

import kz.healthcity.medbox.entities.manipulation.psPatLedgers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

@Service
public class FindNewBonusPatientService {

    kz.healthcity.medbox.services.manipulation.PatLedgersService PatLedgersService;

    @Autowired
    public void setPatLedgersService(kz.healthcity.medbox.services.manipulation.PatLedgersService patLedgersService) {
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
