package kz.healthcity.medbox.controllers.manipulation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class Login {

    @GetMapping("/login")
    public String login(){
        return "/manipulation/login";
    }

    @GetMapping("/login-error")
    public String error(Model model){
        model.addAttribute("loginError",true);
        return "/manipulation/login";
    }


}
