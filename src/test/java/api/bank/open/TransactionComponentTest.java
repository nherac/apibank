package api.bank.open;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.springframework.boot.web.server.LocalServerPort;


import io.restassured.module.mockmvc.RestAssuredMockMvc;

class TransactionComponentTest {
    @LocalServerPort
    private int port;


    @ParameterizedTest
    @CsvFileSource(resources = "/TransactionComponentTest_testEndToEnd.csv")
    public void testEndToEnd(String accountNumber){
        RestAssuredMockMvc.given()
                          .standaloneSetup(new TransactionController(new TransactionService()))
                          .when()
                          .get(String.format("http://localhost:%s/transactions/%s",port, accountNumber))
                          .then()
                          .statusCode(Matchers.is(200));
    }

}