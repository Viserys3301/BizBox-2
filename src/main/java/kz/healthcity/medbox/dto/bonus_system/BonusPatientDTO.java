package kz.healthcity.medbox.dto.bonus_system;

import kz.healthcity.medbox.entities.bonus_system.Patient;
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
public class BonusPatientDTO {
    private Long id;
    private String name;
    private Long bizBoxPatientId;
    private BigDecimal accumulatedAmount;
    private Boolean isActive;
    private String discounts;
    private Byte rate;



    public BonusPatientDTO getPatientDto(Patient patient) {
        return BonusPatientDTO.builder()
                .id(patient.getId())
                .name(patient.getName())
                .bizBoxPatientId(patient.getBizBoxPatientId())
                .accumulatedAmount(patient.getAccumulatedAmount())
                .isActive(patient.getIsActive())
                .discounts(patient.getDiscounts().getTitle())
                .rate(patient.getDiscounts().getRate())
                .build();
    }

    public List<BonusPatientDTO> getPatientDtoList(List<Patient> patientList) {
        List<BonusPatientDTO> list=new ArrayList<>();
        for (Patient p:patientList) {
            list.add(
                    BonusPatientDTO.builder()
                            .id(p.getId())
                            .name(p.getName())
                            .bizBoxPatientId(p.getBizBoxPatientId())
                            .accumulatedAmount(p.getAccumulatedAmount())
                            .isActive(p.getIsActive())
                            .discounts(p.getDiscounts().getTitle())
                            .rate(p.getDiscounts().getRate())
                            .build()

            );
        }
        return list;
    }
}
