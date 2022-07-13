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

    public Page<AssistanceList>  findTop31ByOrderByFullname(){
        Page<AssistanceList> corp_clients =  assistanceListRepository.findAll(PageRequest.of(20,10));


        return  corp_clients;
    }

    public List<AssistanceList> findByCompanyId(Integer id){

        List<AssistanceList> corp_clients =  assistanceListRepository.findByCompanyId(id);


        for (int i = 0; i < corp_clients.size(); i++) {
            corp_clients.get(i).setClientName(datacenterService.findClientNameById((long)corp_clients.get(i).getDatacenter_ID()));
            corp_clients.get(i).setClientRefName(datacenterService.findClientNameById((long)corp_clients.get(i).getDatacenter_REF()));
            corp_clients.get(i).setCompanyName(assistanceClientsService.findNameById(corp_clients.get(i).getCompanyId()));
            corp_clients.get(i).setPackageName(assistancePackagesService.getNameById(corp_clients.get(i).getAssistance_packages_ID()));
        }
            return corp_clients;
    }
}
