package com.ladzani.quickstart.domain.dto;

import com.ladzani.quickstart.domain.entities.AuthorEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class BookDto {

    private String isbn;

    private String title;

    private AuthorDto authorDto;
}
