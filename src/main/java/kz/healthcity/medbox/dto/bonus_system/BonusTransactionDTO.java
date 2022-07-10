package kz.healthcity.medbox.dto.bonus_system;

import kz.healthcity.medbox.entities.bonus_system.Patient;
import kz.healthcity.medbox.entities.bonus_system.Transaction;
import lombok.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Component
public class BonusTransactionDTO {
    private Long id;
    private Long patientId;
    private Long bizBoxTransactionId;
    private Long bizBoxInnerTransactionId;
    private Byte discountsRate;
    private Boolean completed;
    private Boolean canceled;
    private Timestamp date;



    public BonusTransactionDTO get(Transaction transaction){
        return BonusTransactionDTO.builder()
                .id(transaction.getId())
                .patientId(transaction.getPatients().getId())
                .bizBoxTransactionId(transaction.getBizBoxTransactionId())
                .bizBoxInnerTransactionId(transaction.getBizBoxInnerTransactionId())
                .discountsRate(transaction.getDiscountsRate())
                .completed(transaction.getCompleted())
                .canceled(transaction.getCanceled())
                .date(transaction.getDate())
                .build();
    }

    public List<BonusTransactionDTO> findAll(List<Transaction> transactions){
        List<BonusTransactionDTO> transactionDTOS = new ArrayList<>();

        for (Transaction t:transactions) {
            transactionDTOS.add(
                    BonusTransactionDTO.builder()
                            .id(t.getId())
                            .patientId(t.getPatients().getId())
                            .bizBoxTransactionId(t.getBizBoxTransactionId())
                            .bizBoxInnerTransactionId(t.getBizBoxInnerTransactionId())
                            .discountsRate(t.getDiscountsRate())
                            .completed(t.getCompleted())
                            .canceled(t.getCanceled())
                            .date(t.getDate())
                            .build()
            );
        }
        return transactionDTOS;
    }
}
