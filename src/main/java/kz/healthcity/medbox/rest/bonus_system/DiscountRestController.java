package kz.healthcity.medbox.rest.bonus_system;

import kz.healthcity.medbox.dto.bonus_system.BonusDiscountDTO;
import kz.healthcity.medbox.entities.bonus_system.Discount;
import kz.healthcity.medbox.exceptions.DiscountException;
import kz.healthcity.medbox.services.bonus_system.DiscountService;
import lombok.SneakyThrows;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bonus_system/discount")
public class DiscountRestController {

    DiscountService discountService;
    BonusDiscountDTO bonusDiscountDTO;

    @Autowired
    public void setBonusDiscountDTO(BonusDiscountDTO bonusDiscountDTO) {
        this.bonusDiscountDTO = bonusDiscountDTO;
    }

    @Autowired
    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }

    @SneakyThrows
    @GetMapping(path = "/{id}/id",produces = "application/json")
    public BonusDiscountDTO getDiscount(@PathVariable(value = "id") Long id){
        Discount discount = discountService.findById(id).orElseThrow(NotFound::new);
        return bonusDiscountDTO.getDiscountDTO(discount);
    }

    @GetMapping("/list")
    public List<BonusDiscountDTO> getAll(){
        List<Discount> discounts = discountService.findAll();
        return bonusDiscountDTO.getAll(discounts);
    }

    @PostMapping(produces = "application/json",consumes = "application/json")
    public Discount save(@RequestBody Discount discount){
        discountService.saveOrUpdate(discount);
        return discount;
    }

    @PutMapping(produces = "application/json",consumes = "application/json")
    public Discount update(@RequestBody Discount discount){
        discountService.saveOrUpdate(discount);
        return discount;
    }

    @DeleteMapping("/{id}/id")
    public void delete(@PathVariable(value = "id")Long id){
        discountService.deleteById(id);
    }
}
