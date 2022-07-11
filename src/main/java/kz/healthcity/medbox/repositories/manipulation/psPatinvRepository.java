package kz.healthcity.medbox.repositories.manipulation;

import kz.healthcity.medbox.entities.manipulation.PatRegisters;
import kz.healthcity.medbox.entities.manipulation.psPatinv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface psPatinvRepository extends JpaRepository<psPatinv,Long> {
    List<psPatinv> findByPrimaryKey(Long primaryKey);

}
