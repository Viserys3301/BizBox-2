package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.entities.manipulation.psPatitem;
import kz.healthcity.medbox.repositories.manipulation.psPatitemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;

@Service
public class psPatitemService {

    psPatitemRepository patitemRepository;
    WarehouseService warehouseService;

    ItemService  itemService;

    DatacenterService datacenterService;

    @Autowired
    public void setDatacenterService(DatacenterService datacenterService) {
        this.datacenterService = datacenterService;
    }

    @Autowired
    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }

    @Autowired
    public void setWarehouseService(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }

    @Autowired
    public void setPatitemRepository(psPatitemRepository patitemRepository) {
        this.patitemRepository = patitemRepository;
    }

    public Optional<psPatitem> findById(Integer id){
        return patitemRepository.findById(id);
    }

    @Transactional
    public void update(psPatitem patitem){
        patitemRepository.save(patitem);
    }

    public Map<Integer,List<psPatitem>> findByPatientId(Integer patientId){
        Map<Integer, List<psPatitem>> ambulatories = new HashMap<>();


        List<psPatitem> list = patitemRepository.findByPatientId(patientId);

        for (psPatitem p:list) {
            ambulatories.put(p.getFK_psPatRegisters(),patitemRepository.findByInnerId(p.getInnerId()));
        }

        //TODO ДОДУШИТЬ ПОМЕНЯТЬ СУЩНОСТЬ НА PS PAT REG

        return ambulatories;
    }

    public List<psPatitem> findByInnerId(Long id) {
        List<psPatitem> list = patitemRepository.findByInnerId(id);

        for (int i = 0; i < list.size(); i++) {
           list.get(i).setBranchName(warehouseService.findDescriptionById(list.get(i).getFK_mscWarehouse()));
            //   list.get(i).setItemName(warehouseService.findDescriptionById(list.get(i).getFK_mscWarehouse()));
           list.get(i).setItemName(itemService.findDescriptionById(String.valueOf(list.get(i).getItem())));
           list.get(i).setDoctorName(datacenterService.findNameById((long)list.get(i).getFK_emdDoctorsREQ()));
        }

      return   list;
    }


    public void update(Long innerId){
        patitemRepository.update(innerId);
    }
}
