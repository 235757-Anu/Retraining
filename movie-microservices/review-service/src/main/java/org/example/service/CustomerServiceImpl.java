package org.example.service;

import org.example.dto.CustomerDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    private String url = "http://CUSTOMER-SERVICE/api/v1/customers/?email={email}";
    private RestTemplate restTemplate;
    public CustomerServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Optional<CustomerDto> findByEmail(String email) {
        try {
            final var response = restTemplate.getForEntity(url, CustomerDto.class, email);
            if (response.getStatusCode().is2xxSuccessful()) {
                var body = response.getBody();
                return Optional.ofNullable(body);
            }
            return Optional.empty();
        } catch (Exception e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
