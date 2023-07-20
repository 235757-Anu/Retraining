package in.stackroute.ust.movie.customer.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public record LoginDto(
        @NotBlank @NotEmpty String email,
        @NotBlank @NotEmpty String password) {
}
