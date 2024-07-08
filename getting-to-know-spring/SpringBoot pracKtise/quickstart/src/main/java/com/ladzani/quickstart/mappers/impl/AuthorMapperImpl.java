package com.ladzani.quickstart.mappers.impl;

import com.ladzani.quickstart.domain.dto.AuthorDto;
import com.ladzani.quickstart.domain.entities.AuthorEntity;
import com.ladzani.quickstart.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapperImpl implements Mapper<AuthorEntity, AuthorDto> {

    private final ModelMapper modelMapper;

    public AuthorMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public AuthorDto mapTo(AuthorEntity authorEntity) {
        return modelMapper.map(authorEntity, AuthorDto.class);
    }

    @Override
    public AuthorEntity mapFrom(AuthorDto authorDto) {
        return  modelMapper.map(authorDto, AuthorEntity.class);
    }
}
