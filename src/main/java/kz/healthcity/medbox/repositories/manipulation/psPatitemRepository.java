package kz.healthcity.medbox.repositories.manipulation;

import kz.healthcity.medbox.entities.manipulation.psPatitem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface psPatitemRepository extends JpaRepository<psPatitem,Integer> {

    List<psPatitem> findByPatientId(Integer patientId);
}
