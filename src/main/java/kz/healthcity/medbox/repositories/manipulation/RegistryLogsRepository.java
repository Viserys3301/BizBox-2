package kz.healthcity.medbox.repositories.manipulation;

import kz.healthcity.medbox.entities.manipulation.RegistryLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistryLogsRepository extends JpaRepository<RegistryLogs,Integer> {

    List<RegistryLogs> findTop31ByOrderByID();
}
