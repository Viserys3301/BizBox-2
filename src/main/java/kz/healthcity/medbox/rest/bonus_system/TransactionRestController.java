package kz.healthcity.medbox.rest.bonus_system;

import kz.healthcity.medbox.dto.bonus_system.BonusDiscountDTO;
import kz.healthcity.medbox.dto.bonus_system.BonusTransactionDTO;
import kz.healthcity.medbox.entities.bonus_system.Transaction;
import kz.healthcity.medbox.services.bonus_system.TransactionService;
import lombok.SneakyThrows;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bonus_system/transaction")
public class TransactionRestController {

    TransactionService transactionService;
    BonusTransactionDTO bonusTransactionDTO;

    @Autowired
    public void setBonusTransactionDTO(BonusTransactionDTO bonusTransactionDTO) {
        this.bonusTransactionDTO = bonusTransactionDTO;
    }

    @Autowired
    public void setTransactionService(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @SneakyThrows
    @GetMapping(path = "/{id}/id",produces = "application/json")
    public BonusTransactionDTO getById(@PathVariable(value = "id") Long id){
        Transaction transaction = transactionService.findById(id).orElseThrow(NotFound::new);
        return bonusTransactionDTO.get(transaction);
    }

    @GetMapping("/list")
    public List<BonusTransactionDTO> getAll(){
        List<Transaction> transactions = transactionService.findAll();
        return bonusTransactionDTO.findAll(transactions);
    }

    @PostMapping(produces = "application/json",consumes = "application/json")
    public Transaction save(@RequestBody Transaction transaction){
        transactionService.saveOrUpdate(transaction);
        return transaction;
    }
}
