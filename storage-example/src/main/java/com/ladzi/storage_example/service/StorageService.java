package com.ladzi.storage_example.service;

import com.ladzi.storage_example.entity.Product;
import com.ladzi.storage_example.repository.StorageRepository;
import com.ladzi.storage_example.util.ImageUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

@Service
public class StorageService {
    private final StorageRepository storageRepository;

    public StorageService(StorageRepository storageRepository) {
        this.storageRepository = storageRepository;
    }
    public String uploadImage(MultipartFile file) throws IOException {
        Product product = Product.builder()
                .name(file.getOriginalFilename())
                .quantity(1L)
                .imageData(file.getBytes())
                .build();
        Product savedProduct = storageRepository.save(product);
        return "image saved successfully: " + file.getOriginalFilename();

    }

    public byte[] downloadImage(String fileName) {
         Product product = storageRepository.findAll().get(0);
         return product.getImageData();
    }
}
