package in.stackroute.ust.movie.customer.service;

import in.stackroute.ust.movie.customer.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer save(Customer customer);

    Customer update(Customer customer);

    void deleteById(int id);

    Optional<Customer> findById(int id);

    Optional<Customer> findByEmail(String email);

    Optional<Customer> findByEmailAndPassword(String email,String password);

    List<Customer> findAll();

}
