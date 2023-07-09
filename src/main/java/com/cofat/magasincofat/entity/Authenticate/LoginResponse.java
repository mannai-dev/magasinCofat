package com.cofat.magasincofat.entity.Authenticate;

import com.cofat.magasincofat.entity.ln.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {
    private User user;
    //private String jwtToken;
    private String accessToken ;
}
