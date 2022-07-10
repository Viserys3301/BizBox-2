package kz.healthcity.medbox.rest.manipulation;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/biz_box")
public class ManipulationRestController {

    @PutMapping(path = "/update_date/ambulance/{id}/id",produces = "application/json")
    public Boolean updateAmmulanceDate(@PathVariable("id") Long id){
        return false;
    }

    @PutMapping(path = "/update_date/birth_date/{id}/id",produces = "application/json")
    public Boolean updateBirthDate(@PathVariable(value = "id") Long id){
        return false;
    }

    @PutMapping(path = "/delte_payment/{id}/id")
    public Boolean deletePayment(@PathVariable(value = "id")Long id){
        return false;
    }
}
