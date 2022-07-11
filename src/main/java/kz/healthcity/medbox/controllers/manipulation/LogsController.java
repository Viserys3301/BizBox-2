package kz.healthcity.medbox.controllers.manipulation;

import kz.healthcity.medbox.services.manipulation.RegistryLogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logs")
public class LogsController {
    RegistryLogsService registryLogsService;

    @Autowired
    public void setRegistryLogsService(RegistryLogsService registryLogsService) {
        this.registryLogsService = registryLogsService;
    }

    @GetMapping
    public String getLogsPage(Model model){
        model.addAttribute("logs",registryLogsService.findTop31ByOrderByID());
        return "/manipulation/logs";
    }
}
