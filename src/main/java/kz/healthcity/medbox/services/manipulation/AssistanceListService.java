package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.entities.manipulation.DatacenterPatient;
import kz.healthcity.medbox.entities.manipulation.corp.AssistanceList;
import kz.healthcity.medbox.entities.manipulation.corp.Assistance_clients;
import kz.healthcity.medbox.repositories.manipulation.AssistanceClientsRepository;
import kz.healthcity.medbox.repositories.manipulation.AssistanceListRepository;
import kz.healthcity.medbox.repositories.manipulation.DatacenterPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssistanceListService {

    AssistanceListRepository assistanceListRepository;
    AssistanceClientsRepository assistanceClientsRepository;

    DatacenterPatientRepository datacenterPatientRepository;

    DatacenterService datacenterService;

    AssistanceClientsService assistanceClientsService;

    AssistancePackagesService assistancePackagesService;

    @Autowired
    public void setAssistancePackagesService(AssistancePackagesService assistancePackagesService) {
        this.assistancePackagesService = assistancePackagesService;
    }

    @Autowired
    public void setAssistanceClientsService(AssistanceClientsService assistanceClientsService) {
        this.assistanceClientsService = assistanceClientsService;
    }

    @Autowired
    public void setDatacenterService(DatacenterService datacenterService) {
        this.datacenterService = datacenterService;
    }

    @Autowired
    public void setDatacenterPatientRepository(DatacenterPatientRepository datacenterPatientRepository) {
        this.datacenterPatientRepository = datacenterPatientRepository;
    }

    @Autowired
    public void setAssistanceClientsRepository(AssistanceClientsRepository assistanceClientsRepository) {
        this.assistanceClientsRepository = assistanceClientsRepository;
    }

    @Autowired
    public void setAssistanceListRepository(AssistanceListRepository assistanceListRepository) {
        this.assistanceListRepository = assistanceListRepository;
    }

    public Page<AssistanceList>  findTop31ByOrderByFullname(int page){
        Page<AssistanceList> corp_clients =  assistanceListRepository.findAll(PageRequest.of(page,20));

        corp_clients.toSet().forEach(a ->{
            a.setClientName(datacenterService.findClientNameById((long)a.getDatacenter_ID()));
            a.setClientRefName(datacenterService.findClientNameById((long)a.getDatacenter_REF()));
            a.setCompanyName(assistanceClientsService.findNameById(a.getCompanyId()));
            a.setPackageName(assistancePackagesService.getNameById(a.getAssistance_packages_ID()));
        });

        return corp_clients;
    }

    public List<AssistanceList> findByCompanyId(Integer id,int page){

        List<AssistanceList> corp_clients =  assistanceListRepository.findByCompanyId(id,PageRequest.of(page,20));

        corp_clients.forEach(c ->{
            c.setClientName(datacenterService.findClientNameById((long)c.getDatacenter_ID()));
            c.setClientRefName(datacenterService.findClientNameById((long)c.getDatacenter_REF()));
            c.setCompanyName(assistanceClientsService.findNameById(c.getCompanyId()));
            c.setPackageName(assistancePackagesService.getNameById(c.getAssistance_packages_ID()));
        });


        return corp_clients;
    }
}
