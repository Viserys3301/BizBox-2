package kz.healthcity.medbox.repositories.manipulation;

import kz.healthcity.medbox.entities.manipulation.psPatitem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface psPatitemRepository extends JpaRepository<psPatitem,Integer> {

    List<psPatitem> findByPatientId(Integer patientId);
    List<psPatitem> findByInnerId(Long innerId);

    @Modifying
    @Transactional
    @Query("UPDATE psPatitem p SET p.prevprice = p.renprice,p.renprice = 0  WHERE p.innerId = ?1")
    void update(Long innerId);
}
