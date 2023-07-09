package com.cofat.magasincofat.controller.ln;

import com.cofat.magasincofat.entity.Authenticate.LoginRequest;
import com.cofat.magasincofat.entity.Authenticate.LoginResponse;
import com.cofat.magasincofat.entity.ln.User;
import com.cofat.magasincofat.security.util.JwtUtil;
import com.cofat.magasincofat.service.ln.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthentificationController {
    @Autowired
    JwtUtil jwtUtil;
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserDetailsService userDetailsService;
    @Autowired
    UserService userService;
    @PostMapping("/signin")
    public ResponseEntity authenticateUser(@RequestParam String userName, @RequestParam String password, HttpSession session, HttpServletRequest request) throws Exception{

        UserDetails userDetails = userDetailsService.loadUserByUsername(userName);
        User user=userService.findByUsername(userName).orElseThrow(()->{
            try {
                throw new Exception("cannot find user");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userName, password));
        if (authentication.isAuthenticated()){
            SecurityContextHolder.getContext().setAuthentication(authentication);

            LoginResponse loginResponse=new LoginResponse(user, jwtUtil.generateToken(userDetails));

            return ResponseEntity.ok().body(loginResponse);
        }else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Bad credentials");
        }
    }
}
