package com.cofat.magasincofat.entity.Authenticate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LoginRequest {
    @NotBlank(message = "required")
    private String username;

    @NotBlank(message = "required")
    private String password;

}

