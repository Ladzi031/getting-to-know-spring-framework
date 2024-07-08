package com.ladzani.quickstart.controllers;

import com.ladzani.quickstart.domain.dto.BookDto;
import com.ladzani.quickstart.domain.entities.BookEntity;
import com.ladzani.quickstart.mappers.Mapper;
import com.ladzani.quickstart.services.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BookController {

    private final Mapper<BookEntity, BookDto> bookMapper;

    private final BookService bookService;

    public BookController(Mapper<BookEntity, BookDto> bookMapper, BookService bookService) {
        this.bookMapper = bookMapper;
        this.bookService = bookService;
    }

    @PutMapping(path = "/books/{isbn}")
    public ResponseEntity<BookDto> createBook(@RequestBody BookDto bookDto, @PathVariable("isbn") String isbn) {

        BookEntity bookEntity = bookMapper.mapFrom(bookDto);
        BookEntity savedBookEntity = bookService.createBook(isbn, bookEntity);
        return new ResponseEntity<>(bookMapper.mapTo(savedBookEntity), HttpStatus.CREATED);
    }

    @GetMapping(path = "/books")
    public Page<BookDto> listBooks(Pageable pageable) {
        Page<BookEntity> books = bookService.findAll(pageable);
        return books.map(bookMapper::mapTo);
    }
}
