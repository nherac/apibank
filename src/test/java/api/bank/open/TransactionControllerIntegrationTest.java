package api.bank.open;

import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import java.lang.reflect.Array;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.Matchers.*;



@SpringBootTest
@AutoConfigureMockMvc
class TransactionControllerIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void test01() throws Exception {

        //ResultActions response =
        ResultActions resultActions = mvc.perform(get("/transactions/{id}", 123))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());




    }

}