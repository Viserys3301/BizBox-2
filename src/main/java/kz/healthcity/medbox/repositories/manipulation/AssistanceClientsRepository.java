package kz.healthcity.medbox.repositories.manipulation;

import kz.healthcity.medbox.entities.manipulation.corp.Assistance_clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssistanceClientsRepository extends JpaRepository<Assistance_clients,Integer> {
    List<Assistance_clients> findTop31ByOrderByID();
}
