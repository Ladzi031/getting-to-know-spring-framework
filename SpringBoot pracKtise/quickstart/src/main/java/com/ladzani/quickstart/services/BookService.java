package com.ladzani.quickstart.services;


import com.ladzani.quickstart.domain.entities.AuthorEntity;
import com.ladzani.quickstart.domain.entities.BookEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collection;
import java.util.List;

public interface BookService {
    BookEntity createBook(String isbn, BookEntity bookEntity);

    List<BookEntity> findAll();

    Page<BookEntity> findAll(Pageable pageable);
}
