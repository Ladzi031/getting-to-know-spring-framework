package com.ladzi.storage_example.repository;

import com.ladzi.storage_example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StorageRepository extends JpaRepository<Product, Long> {

   Optional<Product> findByName(String name);
}
