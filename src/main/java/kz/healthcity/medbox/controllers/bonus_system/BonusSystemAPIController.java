package kz.healthcity.medbox.controllers.bonus_system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bonus_system/api")
public class BonusSystemAPIController {

    @GetMapping
    public String getPage(){
        return "/bonus-system/api";
    }
}
