package api.bank.open;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class TransactionServiceTest {

    TransactionService transactionService = new TransactionService();

    @DisplayName("When search for transaction, it will return the list size")
    @ParameterizedTest
    @CsvFileSource(resources = "/TransactionServiceTest_SearchTransaction.csv")
    void testSearchTransaction(Integer numberOfTransactionForAnAccountNumber, Integer accountNumber){
        assertEquals(numberOfTransactionForAnAccountNumber, transactionService.findAllByAccountNumber(accountNumber).size());

    }

}