package kz.healthcity.medbox.repositories.manipulation;

import kz.healthcity.medbox.entities.manipulation.corp.AssistanceList;
import kz.healthcity.medbox.entities.manipulation.corp.Assistance_clients;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssistanceListRepository extends JpaRepository<AssistanceList,Integer> {

    List<AssistanceList> findTop31ByOrderByID();
    List<AssistanceList> findByCompanyId(Integer id,PageRequest pageRequest);
}
