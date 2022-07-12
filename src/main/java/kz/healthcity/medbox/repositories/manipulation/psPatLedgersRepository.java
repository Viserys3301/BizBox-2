package kz.healthcity.medbox.repositories.manipulation;

import kz.healthcity.medbox.entities.manipulation.psPatLedgers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface psPatLedgersRepository extends JpaRepository<psPatLedgers,Long>{
        List<psPatLedgers> findByPatRegisters(Integer patRegisters);
        List<psPatLedgers> findByInnerId(Long innerId);

        @Modifying
        @Transactional
        @Query("UPDATE psPatLedgers p SET p.debit = 0, p.discount = 0  WHERE p.innerId = :innerId")
        void update(@Param("innerId") Long innerId);

}
