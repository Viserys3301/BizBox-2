package kz.healthcity.medbox.dto.bonus_system;

import kz.healthcity.medbox.entities.bonus_system.Discount;
import lombok.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Component
public class BonusDiscountDTO {
    private Long id;
    private String title;
    private BigDecimal startBonusSum;
    private Byte rate;
    private Boolean isActive;

    public BonusDiscountDTO getDiscountDTO(Discount discount){
       return BonusDiscountDTO.builder()
                .id(discount.getId())
                .title(discount.getTitle())
               .startBonusSum(discount.getStartBonusSum())
               .rate(discount.getRate())
               .isActive(discount.getIsActive())
               .build();

    }

    public List<BonusDiscountDTO> getAll(List<Discount> discounts){
        List<BonusDiscountDTO> discountDTOS = new ArrayList<>();

        for (Discount d:discounts) {
            discountDTOS.add(
                    BonusDiscountDTO.builder()
                            .id(d.getId())
                            .title(d.getTitle())
                            .startBonusSum(d.getStartBonusSum())
                            .rate(d.getRate())
                            .isActive(d.getIsActive())
                            .build()

            );
        }
              return discountDTOS;
    }
}
