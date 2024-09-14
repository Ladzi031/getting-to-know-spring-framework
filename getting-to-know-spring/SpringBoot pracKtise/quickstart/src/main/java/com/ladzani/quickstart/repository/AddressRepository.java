package com.ladzani.quickstart.repository;

import com.ladzani.quickstart.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
