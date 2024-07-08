package com.ladzani.quickstart;

import com.ladzani.quickstart.domain.dto.AuthorDto;
import com.ladzani.quickstart.domain.dto.BookDto;
import com.ladzani.quickstart.domain.entities.AuthorEntity;
import com.ladzani.quickstart.domain.entities.BookEntity;

public final class TestDataUtil {
    private TestDataUtil(){}


    public static AuthorEntity createAuthorForTest() {
        return AuthorEntity.builder()
                .id(1L)
                .name("James Muller")
                .age(80)
                .build();
    }

    public static AuthorDto createAuthorDtoForTest() {
        return AuthorDto.builder()
                .name("James Muller")
                .age(80)
                .build();
    }
    public static AuthorEntity createAuthorForTestA() {
        return AuthorEntity.builder()
                .name("Roger Kim")
                .age(40)
                .build();
    }

    public static AuthorEntity createAuthorForTestB() {
        return AuthorEntity.builder()
                .name("Ozil Mullsanne")
                .age(30)
                .build();
    }
    public static AuthorEntity createAuthorForTestC() {
        return AuthorEntity.builder()
                .name("Karrim Bamuda")
                .age(25)
                .build();
    }

    public static BookEntity createBookForTest(AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("1234")
                .title("The Life Of Pi")
                .authorEntity(authorEntity)
                .build();
    }

    public static BookEntity createBookForTestA(AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("1")
                .title("The Life Of Pi")
                .authorEntity(authorEntity)
                .build();
    }

    public static BookEntity createBookForTestB(AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("2")
                .title("The London Bridge hasn't Fallen")
                .authorEntity(authorEntity)
                .build();
    }

    public static BookEntity createBookForTestC(AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("3")
                .title("Guide to becoming a SuperHero")
                .authorEntity(authorEntity)
                .build();
    }

    public static BookDto createBookDtoForTest() {
        return BookDto.builder()
                .isbn("3")
                .title("Guide to becoming a SuperHero")
                .build();
    }
}
