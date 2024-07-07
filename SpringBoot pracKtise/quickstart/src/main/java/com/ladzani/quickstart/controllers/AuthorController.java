package com.ladzani.quickstart.controllers;

import com.ladzani.quickstart.domain.dto.AuthorDto;
import com.ladzani.quickstart.domain.entities.AuthorEntity;
import com.ladzani.quickstart.mappers.Mapper;
import com.ladzani.quickstart.services.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AuthorController {

    private final AuthService authService;

    private final Mapper<AuthorEntity, AuthorDto> authorMapper ;

    public AuthorController(final AuthService authService, final Mapper<AuthorEntity, AuthorDto> mapper) {
        this.authService = authService;
        this.authorMapper = mapper;
    }

    @PostMapping(path = "/authors")
    public ResponseEntity<AuthorDto> createAuthor(@RequestBody AuthorDto authorDto) {

        AuthorEntity authorEntity = authorMapper.mapFrom(authorDto);
        AuthorEntity savedAuthorEntity = authService.save(authorEntity);

        return new ResponseEntity<>(authorMapper.mapTo(savedAuthorEntity), HttpStatus.CREATED);
    }

    @GetMapping(path = "/authors")
    public List<AuthorDto> listAuthors() {
        // come back to this
        List<AuthorEntity> authors = authService.findAll();
        return authors.stream()
                .map(authorMapper::mapTo)
                .collect(Collectors.toList());
    }

    @GetMapping(path = "/authors/{id}")
    public ResponseEntity<AuthorDto> getAuthor(@PathVariable("id") Long id) {
       return  authService.findOne(id)
               .map(a -> new ResponseEntity<>(authorMapper.mapTo(a), HttpStatus.OK))
               .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping(path = "/authors/{id}")
    public ResponseEntity<AuthorDto> fullUpdateAuthor(@PathVariable("id") Long id,  @RequestBody AuthorDto authorDto) {
        if(!authService.isExists(id)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        authorDto.setId(id);
        AuthorEntity authorToUpdate = authorMapper.mapFrom(authorDto);
        AuthorEntity updatedAuthor = authService.save(authorToUpdate);
        return new ResponseEntity<>(authorMapper.mapTo(updatedAuthor), HttpStatus.CREATED);
    }
}
