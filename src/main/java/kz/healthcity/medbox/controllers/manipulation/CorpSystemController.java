package kz.healthcity.medbox.controllers.manipulation;

import kz.healthcity.medbox.services.manipulation.AssistanceClientsService;
import kz.healthcity.medbox.services.manipulation.AssistanceListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/corp_system")
public class CorpSystemController {

    AssistanceClientsService assistanceClientsService;
    AssistanceListService assistanceListService;

    @Autowired
    public void setAssistanceListService(AssistanceListService assistanceListService) {
        this.assistanceListService = assistanceListService;
    }

    @Autowired
    public void setAssistanceClientsService(AssistanceClientsService assistanceClientsService) {
        this.assistanceClientsService = assistanceClientsService;
    }

    @GetMapping("/companies")
    public String getCompanies(Model model){
        model.addAttribute("companies",assistanceClientsService.findAll());
        return "manipulation/companies";
    }

    @GetMapping("/corp_clients")
    public String getCorpClients(Model model, @RequestParam(name = "nameFilter",required = false) Integer id){
        if(id==null){
            model.addAttribute("clients",assistanceListService.findTop31ByOrderByFullname());
            model.addAttribute("companies",assistanceClientsService.findAll());
        }else {
            model.addAttribute("clients",assistanceListService.findByCompanyId(id));
            model.addAttribute("companies",assistanceClientsService.findAll());
        }

        return "manipulation/clients";
    }

}
