package org.example.service;

import org.example.dto.CustomerDto;

import java.util.Optional;

public interface CustomerService {
    Optional<CustomerDto> findByEmail(String email);
}
