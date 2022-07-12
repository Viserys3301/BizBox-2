package kz.healthcity.medbox.services.manipulation;

import kz.healthcity.medbox.repositories.manipulation.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    ItemRepository itemRepository;

    @Autowired
    public void setItemRepository(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public String findDescriptionById(String id){
        Item item = itemRepository.findById(id).get();
        return item.getItemdesc();
    }
}
