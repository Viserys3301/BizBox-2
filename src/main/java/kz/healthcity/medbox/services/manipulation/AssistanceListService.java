package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.entities.manipulation.DatacenterPatient;
import kz.healthcity.medbox.entities.manipulation.corp.AssistanceList;
import kz.healthcity.medbox.entities.manipulation.corp.Assistance_clients;
import kz.healthcity.medbox.repositories.manipulation.AssistanceClientsRepository;
import kz.healthcity.medbox.repositories.manipulation.AssistanceListRepository;
import kz.healthcity.medbox.repositories.manipulation.DatacenterPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public List<AssistanceList>  findTop31ByOrderByFullname(){
        List<AssistanceList> corp_clients =assistanceListRepository.findTop31ByOrderByID();
        List<AssistanceList> top30 = new ArrayList<>();
        for (int i = 0; i < corp_clients.size(); i++) {
            corp_clients.get(i).setClientName(datacenterService.findClientNameById((long)corp_clients.get(i).getDatacenter_ID()));
            corp_clients.get(i).setClientRefName(datacenterService.findClientNameById((long)corp_clients.get(i).getDatacenter_REF()));
            corp_clients.get(i).setCompanyName(assistanceClientsService.findNameById(corp_clients.get(i).getAssistance_clients_ID()));
            corp_clients.get(i).setPackageName(assistanceClientsService.findNameById(corp_clients.get(i).getAssistance_clients_ID()));
        }

        int x = 0;

        for (int i = 0; i <corp_clients.size() ; i++) {
            if (x>=20){
                break;
            }
            top30.add(corp_clients.get(i));
            x++;
        }

        return  top30;
    }


}
