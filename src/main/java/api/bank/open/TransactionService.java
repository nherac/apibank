package api.bank.open;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    private List<Transaction> mockingDB(){
        Transaction t1 =  new Transaction("debit", 123, "GPD", 100.00, "ikea", "ikea.png");
        Transaction t2 = new Transaction("credit", 123, "GPD", 10.00, "argos", "argos.png");
        Transaction t3=  new Transaction("debit", 789, "GPD", 10.00, "ikea", "ikea.png");
        Transaction t4 = new Transaction("credit", 123, "GPD", 10.00, "argos", "argos.png");

        return List.of(t1, t2, t3, t4);
    }

    public List<Transaction> findAllByAccountNumber(Integer accountNumber){
        return  mockingDB().stream()
                           .filter(t->t.getAccountNumber().equals(accountNumber))
                           .collect(Collectors.toList());
    }
}
