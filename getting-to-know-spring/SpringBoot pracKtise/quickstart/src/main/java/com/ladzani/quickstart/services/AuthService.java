package com.ladzani.quickstart.services;

import com.ladzani.quickstart.domain.entities.AuthorEntity;

import java.util.List;
import java.util.Optional;

public interface AuthService {
    AuthorEntity save(AuthorEntity authorEntity);

    List<AuthorEntity> findAll();

    Optional<AuthorEntity> findOne(Long id);

    Boolean isExists(Long id);


}
