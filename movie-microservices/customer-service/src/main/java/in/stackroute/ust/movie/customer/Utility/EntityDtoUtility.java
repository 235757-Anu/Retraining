package in.stackroute.ust.movie.customer.Utility;

import in.stackroute.ust.movie.customer.domain.Customer;
import in.stackroute.ust.movie.customer.dto.CustomerDto;

public class EntityDtoUtility {
    public static Customer toEntity(CustomerDto dto) {
        return new Customer(dto.id(), dto.name(), dto.email(), dto.password());
    }

    public static CustomerDto toDto(Customer entity) {
        return new CustomerDto(entity.getId(), entity.getName(), entity.getEmail(), entity.getPassword());
    }

}
