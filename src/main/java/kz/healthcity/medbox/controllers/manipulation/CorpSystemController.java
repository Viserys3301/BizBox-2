package kz.healthcity.medbox.controllers.manipulation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/corp_system")
public class CorpSystemController {

    @GetMapping
    public String getCompanies(Model model){

        return "manipulation/companies";
    }
}
