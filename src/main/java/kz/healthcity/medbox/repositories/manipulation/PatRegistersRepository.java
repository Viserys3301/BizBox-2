package kz.healthcity.medbox.repositories.manipulation;

import kz.healthcity.medbox.entities.manipulation.PatRegisters;
import kz.healthcity.medbox.entities.manipulation.psPatitem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatRegistersRepository extends JpaRepository<PatRegisters,Integer> {
    List<PatRegisters> findByPatientId(Integer patientId);
    List<PatRegisters> findByPatientIdOrderByRegistrydate(Integer patientId);
}
