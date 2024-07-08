package com.ladzani.quickstart.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ladzani.quickstart.TestDataUtil;
import com.ladzani.quickstart.domain.dto.AuthorDto;
import com.ladzani.quickstart.domain.entities.AuthorEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@AutoConfigureMockMvc
public class AuthorControllerIntegrationTests {

    private final MockMvc mockMvc;
    private final ObjectMapper objectMapper;

    @Autowired
    public AuthorControllerIntegrationTests(MockMvc mockMvc, ObjectMapper objectMapper) {
        this.mockMvc = mockMvc;
        this.objectMapper = objectMapper;
    }

    @Test
    public void testThatAuthorSuccessfullyReturnsHttp201Created() throws Exception {

       AuthorEntity author = TestDataUtil.createAuthorForTest();
       author.setId(null);

       String jsonAuthor = objectMapper.writeValueAsString(author);

       mockMvc.perform(MockMvcRequestBuilders
               .post("/authors")
               .contentType(MediaType.APPLICATION_JSON)
               .content(jsonAuthor)
       ).andExpect(
               MockMvcResultMatchers.status().isCreated()
       );
    }

    @Test
    public void testThatCreatedAuthorsSuccessfullyReturnsSavedAuthor() throws Exception {

        AuthorDto author = TestDataUtil.createAuthorDtoForTest();
        author.setId(null);

        String jsonAuthor = objectMapper.writeValueAsString(author);

        mockMvc.perform(MockMvcRequestBuilders
                .post("/authors")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonAuthor)
        ).andExpect(
                MockMvcResultMatchers.jsonPath("$.id").isNumber()
        ).andExpect(
                MockMvcResultMatchers.jsonPath("$.name").value("James Muller")
        ).andExpect(
                MockMvcResultMatchers.jsonPath("$.age").value(80)
        );
    }
}
