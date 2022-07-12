package kz.healthcity.medbox.repositories.manipulation;

import kz.healthcity.medbox.entities.manipulation.corp.AssistanceList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssistanceListRepository extends JpaRepository<AssistanceList,Integer> {

    List<AssistanceList> findTop31ByOrderByID();

}
