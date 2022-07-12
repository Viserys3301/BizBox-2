package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.entities.manipulation.Warehouse;
import kz.healthcity.medbox.repositories.manipulation.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WarehouseService {
    WarehouseRepository warehouseRepository;

    @Autowired
    public void setWarehouseRepository(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    public String findDescriptionById(Short id){
        Warehouse warehouse =warehouseRepository.findById(id).get();
        return warehouse.getDescription();
    }
}
