package kz.healthcity.medbox.repositories.manipulation;

import kz.healthcity.medbox.controllers.manipulation.MedBoxUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<MedBoxUser,Integer> {
    MedBoxUser findFirstByName(String name);
}
