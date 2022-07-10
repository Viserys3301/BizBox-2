package kz.healthcity.medbox.repositories.manipulation;

import kz.healthcity.medbox.entities.manipulation.DatacenterPatient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatacenterPatientRepository extends JpaRepository<DatacenterPatient,Integer> {
    //DatacenterPatient findFirstByOrderByFullnameAsc();
    List<DatacenterPatient> findTop31ByOrderByFullname();
}
