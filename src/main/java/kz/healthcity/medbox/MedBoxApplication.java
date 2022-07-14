package kz.healthcity.medbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication

public class MedBoxApplication {

    public static void main(String[] args) {
        //SpringApplication.run(MedBoxApplication.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(MedBoxApplication.class, args);
        PasswordEncoder encoder = context.getBean(PasswordEncoder.class);
        System.out.println(encoder.encode("Zxcv1234"));
    }

}
