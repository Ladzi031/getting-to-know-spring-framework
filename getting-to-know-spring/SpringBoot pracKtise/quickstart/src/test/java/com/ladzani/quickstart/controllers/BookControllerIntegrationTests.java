package com.ladzani.quickstart.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ladzani.quickstart.TestDataUtil;
import com.ladzani.quickstart.domain.dto.BookDto;
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
@AutoConfigureMockMvc
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class BookControllerIntegrationTests {

    private final MockMvc mockMvc;

    private final ObjectMapper objectMapper;

    @Autowired
    public BookControllerIntegrationTests(MockMvc mockMvc, ObjectMapper objectMapper) {
        this.mockMvc = mockMvc;
        this.objectMapper = objectMapper;
    }

    @Test
    public void testThatBookCanBeCreatedAndStatus201CreatedReturned() throws Exception {
        BookDto book = TestDataUtil.createBookDtoForTest();
        String jsonAuthor = objectMapper.writeValueAsString(book);

        mockMvc.perform(MockMvcRequestBuilders
                .put("/books/"+ book.getIsbn())
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonAuthor)
        ).andExpect(
                MockMvcResultMatchers.status().isCreated()
        );
    }

    @Test
    public void testThatBookCreatedReturnsCreateBook() throws Exception {
        BookDto book = TestDataUtil.createBookDtoForTest();
        String jsonAuthor = objectMapper.writeValueAsString(book);

        mockMvc.perform(MockMvcRequestBuilders
                .put("/books/"+ book.getIsbn())
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonAuthor)
        ).andExpect(
                MockMvcResultMatchers.jsonPath("$.isbn").value(book.getIsbn())
        ).andExpect(
                MockMvcResultMatchers.jsonPath("$.title").value(book.getTitle())
        );
    }

}
