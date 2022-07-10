package kz.healthcity.medbox.controllers.manipulation;

import kz.healthcity.medbox.entities.bonus_system.Patient;
import kz.healthcity.medbox.services.manipulation.AGPService;
import kz.healthcity.medbox.services.manipulation.DatacenterService;
import kz.healthcity.medbox.services.manipulation.psPatinvService;
import kz.healthcity.medbox.services.manipulation.psPatitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/patient")
public class PatientController {

    DatacenterService datacenterService;
    psPatitemService patitemService;

    @Autowired
    public void setPatitemService(psPatitemService patitemService) {
        this.patitemService = patitemService;
    }

    @Autowired
    public void setDatacenterService(DatacenterService datacenterService) {
        this.datacenterService = datacenterService;
    }



    @GetMapping
    public String getPatients(Model model){
        model.addAttribute("patients",datacenterService.findTop31ByOrderByFullname());
        return "manipulation/patients";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable(value = "id") Integer id,Model model){
        model.addAttribute("patient",null);
        return "manipulation/patient";
    }

    @GetMapping("/logs")
    public String getLogs(Model model){

        return "manipulation/logs";
    }

    @GetMapping("/ambulatories/{id}")
    public String getAmbulatories(@PathVariable(value = "id") Integer id,Model model){
        model.addAttribute("ambulatories",patitemService.findByPatientId(id));
        return "manipulation/ambulatories";
    }
}
