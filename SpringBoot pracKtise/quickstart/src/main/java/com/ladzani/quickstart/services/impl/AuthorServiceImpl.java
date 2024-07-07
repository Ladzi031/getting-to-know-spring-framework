package com.ladzani.quickstart.services.impl;

import com.ladzani.quickstart.domain.dto.AuthorDto;
import com.ladzani.quickstart.domain.entities.AuthorEntity;
import com.ladzani.quickstart.repositories.AuthorRepository;
import com.ladzani.quickstart.services.AuthService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class AuthorServiceImpl implements AuthService {

    private final AuthorRepository authorRepository;


    public AuthorServiceImpl(AuthorRepository authorRepository) {

        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity save(AuthorEntity authorEntity) {
        return authorRepository.save(authorEntity);
    }

    @Override
    public List<AuthorEntity> findAll() {
        return StreamSupport.stream(authorRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<AuthorEntity> findOne(Long id) {
        return authorRepository.findById(id);
    }

    @Override
    public Boolean isExists(Long id) {
        return  authorRepository.existsById(id);
    }


}
