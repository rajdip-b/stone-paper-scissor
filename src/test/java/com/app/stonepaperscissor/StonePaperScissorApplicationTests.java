package com.app.stonepaperscissor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.net.URI;

import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class StonePaperScissorApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testPlay() throws Exception {
        mockMvc.perform(get(URI.create("/api/play?q=Stone")))
                .andDo(print())
                .andExpect(status().isOk());
    }

}
