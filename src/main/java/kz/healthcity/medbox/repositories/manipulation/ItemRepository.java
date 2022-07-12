package kz.healthcity.medbox.repositories.manipulation;

import kz.healthcity.medbox.services.manipulation.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item,String> {
}
