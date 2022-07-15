package kz.healthcity.medbox.rest.bonus_system;

import kz.healthcity.medbox.dto.bonus_system.BonusPatientDTO;
import kz.healthcity.medbox.entities.bonus_system.Patient;
import kz.healthcity.medbox.services.bonus_system.PatientService;
import lombok.SneakyThrows;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Tag(name = "User API", description = "API to manipulate user resources")
@RestController
@RequestMapping("/api/v1/bonus_system/patient")
public class PatientRestController {

    private PatientService patientService;
    private BonusPatientDTO bonusPatientDTO;

    @Autowired
    public void setBonusPatientDTO(BonusPatientDTO bonusPatientDTO) {
        this.bonusPatientDTO = bonusPatientDTO;
    }

    @Autowired
    public void setPatientService(PatientService patientService) {
        this.patientService = patientService;
    }

    @SneakyThrows
    @GetMapping(path = "/{id}/id",produces = "application/json")
    public BonusPatientDTO getPatient(@PathVariable(value = "id") Long id){
        Patient patient = patientService.findById(id).orElseThrow(NotFound::new);
        return bonusPatientDTO.getPatientDto(patient);
    }

    @GetMapping(path = "/list" ,produces = "application/json")
    public List<BonusPatientDTO> getAll(){
        List<Patient> patList = patientService.findAll();
        return bonusPatientDTO.getPatientDtoList(patList);
    }
    @PostMapping(produces = "application/json",consumes = "application/json")
    public Patient create(@RequestBody Patient patient){
        patientService.saveOrUpdate(patient);
        return patient;
    }
    @PutMapping(produces = "application/json",consumes = "application/json")
    public Patient update(@RequestBody Patient patient){
        if(patientService.existById(patient.getId())){
            patientService.saveOrUpdate(patient);
            return patient;
        }
        throw new RuntimeException();
    }

}
