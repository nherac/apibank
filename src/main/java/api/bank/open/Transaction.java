package api.bank.open;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Currency;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Transaction {
    private String type;
    private Integer accountNumber;
    private String currency;
    private Double amount;
    private String merchantName;
    private String merchantLogo;

}
