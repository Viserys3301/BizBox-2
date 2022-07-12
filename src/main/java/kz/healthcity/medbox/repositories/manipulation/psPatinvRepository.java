package kz.healthcity.medbox.repositories.manipulation;

import kz.healthcity.medbox.entities.manipulation.psPatinv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface psPatinvRepository extends JpaRepository<psPatinv,Long> {
    List<psPatinv> findByPrimaryKey(Long primaryKey);

    @Modifying
    @Transactional
    @Query("UPDATE psPatinv p SET p.renamount = 0, p.amount = 0,p.discount = 0,p.netamount = 0  WHERE p.primaryKey = ?1")
    void update(Long innerId);

}
