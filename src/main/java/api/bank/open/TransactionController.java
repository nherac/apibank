package api.bank.open;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path= "/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(final TransactionService transactionService){
        this.transactionService = transactionService;
    }

    @GetMapping("/{accountNumber}")
    public List<Transaction> findAllByAccountNumber(@PathVariable ("accountNumber")
                                                    final Integer accountNumber){

        return transactionService.findAllByAccountNumber(accountNumber);

    }
}

