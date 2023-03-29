package com.gabriel.company.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SigninRequest {
    @NotBlank(message = "Email is required!")
    private String email;
    @NotBlank(message = "Password is required!")
    private String password;
}
