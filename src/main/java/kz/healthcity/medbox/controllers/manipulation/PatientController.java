package kz.healthcity.medbox.controllers.manipulation;

import kz.healthcity.medbox.repositories.manipulation.PatRegistersRepository;
import kz.healthcity.medbox.repositories.manipulation.psPatinvRepository;
import kz.healthcity.medbox.services.manipulation.DatacenterService;
import kz.healthcity.medbox.services.manipulation.PatLedgersService;
import kz.healthcity.medbox.services.manipulation.psPatinvService;
import kz.healthcity.medbox.services.manipulation.psPatitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/patient")
public class PatientController {

    DatacenterService datacenterService;
    psPatitemService patitemService;
    PatRegistersRepository registersRepository;
    PatLedgersService patLedgersService;
    psPatinvRepository patinvRepository;
    psPatinvService patinvService;

    @Autowired
    public void setPatinvService(psPatinvService patinvService) {
        this.patinvService = patinvService;
    }

    @Autowired
    public void setPatinvRepository(psPatinvRepository patinvRepository) {
        this.patinvRepository = patinvRepository;
    }

    @Autowired
    public void setPatLedgersService(PatLedgersService patLedgersService) {
        this.patLedgersService = patLedgersService;
    }

    @Autowired
    public void setRegistersRepository(PatRegistersRepository registersRepository) {
        this.registersRepository = registersRepository;
    }

    @Autowired
    public void setPatitemService(psPatitemService patitemService) {
        this.patitemService = patitemService;
    }

    @Autowired
    public void setDatacenterService(DatacenterService datacenterService) {
        this.datacenterService = datacenterService;
    }



    @GetMapping
    public String getPatients(Model model, @RequestParam(name = "nameFilter",required = false) String name){
        if (name == null || name==""){
            model.addAttribute("patients",datacenterService.findTop31ByOrderByFullname());
        }else {
            model.addAttribute("patients",datacenterService.findByFullnameLike(name));
        }
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
        model.addAttribute("ambulatories",registersRepository.findByPatientIdOrderByRegistrydate(id));
        return "manipulation/ambulatories";
    }

    //ОТДЕЛЕНИЯ
    @GetMapping("/ambulatory/{id}")
    public String getAmbulatory(@PathVariable(value = "id") Integer id,Model model){
        model.addAttribute("ambulatories",patLedgersService.findByPatRegisters(id));
        return "manipulation/ambulatory";
    }
//
//    @GetMapping("/items/{id}")
//    public String getItems(@PathVariable(value = "id") Long id,Model model){
//        model.addAttribute("items",patinvRepository.findByPrimaryKey(id));
//        return "manipulation/items";
//    }


    @GetMapping("/items/{id}")
    public String getItems(@PathVariable(value = "id") Long id,Model model){
        model.addAttribute("items",patitemService.findByInnerId(id));
        model.addAttribute("it",patitemService.findByInnerId(id).get(0));
        return "manipulation/items";
    }

    @GetMapping("/update_price/{id}")
    public String updatePrice(@PathVariable(value = "id") Long innerId){
        patitemService.update(innerId);
        patinvService.update(innerId);
        patLedgersService.update(innerId);
        return "redirect:/patient/items/" + innerId;
    }
}
