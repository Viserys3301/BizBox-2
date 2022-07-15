package kz.healthcity.medbox;

import kz.healthcity.medbox.services.bonus_system.FindNewBonusPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication

public class MedBoxApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedBoxApplication.class, args);

    }

}
