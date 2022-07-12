package kz.healthcity.medbox.repositories.manipulation;

import kz.healthcity.medbox.entities.manipulation.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse,Short> {

}
