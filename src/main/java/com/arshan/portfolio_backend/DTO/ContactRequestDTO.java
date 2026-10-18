package com.arshan.portfolio_backend.DTO;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

@Data
public class ContactRequestDTO {
    @NotBlank @Size(min=3,max=50)
    private String name;
    @Email @NotBlank
    private String email;
    @NotBlank
    private String subject;
    @Pattern(
            regexp = "^[0-9]\\d{9}$",
            message = "Mobile number is invalid, Please Enter Correct Number"
    )
    private String phone;
    @NotBlank @Size(max = 2000)
    private String message;
}
