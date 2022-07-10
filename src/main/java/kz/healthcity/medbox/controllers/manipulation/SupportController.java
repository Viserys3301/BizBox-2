package kz.healthcity.medbox.controllers.manipulation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/support")
public class SupportController {

    @GetMapping
    public String getSupport(){
        return "manipulation/support";
    }
}
