package in.stackroute.ust.movie.customer.controller;

import in.stackroute.ust.movie.customer.domain.Customer;
import in.stackroute.ust.movie.customer.dto.CustomerDto;
import in.stackroute.ust.movie.customer.dto.LoginDto;
import in.stackroute.ust.movie.customer.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static in.stackroute.ust.movie.customer.Utility.EntityDtoUtility.toDto;
import static in.stackroute.ust.movie.customer.Utility.EntityDtoUtility.toEntity;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private Logger logger= LoggerFactory.getLogger(CustomerController.class);
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public ResponseEntity<CustomerDto> getCustomerByEmail(@RequestParam String email){
        var one=customerService.findByEmail(email);
        if(one.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(toDto(one.get()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable int id){
        var opt=customerService.findById(id);
        if(opt.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(toDto(opt.get()));
    }

    @PostMapping
    public ResponseEntity<CustomerDto> createCustomer(@Valid @RequestBody CustomerDto dto) {
        var customerEntity = toEntity(dto);
        logger.info("Customer Entity: {}", customerEntity);
        Customer customer = customerService.save(customerEntity);
        logger.info("Customer: {}", customer);
        return ResponseEntity.ok(toDto(customer));
    }

    @PostMapping("/login")
    public ResponseEntity<CustomerDto> loginCustomer(@Valid @RequestBody LoginDto dto) {
        var optional = customerService.findByEmailAndPassword(dto.email(), dto.password());
        if (optional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(toDto(optional.get()));
    }


}
