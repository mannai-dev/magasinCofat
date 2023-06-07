package com.cofat.magasincofat.service.ln;
/*
import com.cofat.magasincofat.entity.LoginRequest;
import com.cofat.magasincofat.entity.LoginResponse;
import com.cofat.magasincofat.entity.RefreshToken;
import com.cofat.magasincofat.entity.ln.User;
import com.cofat.magasincofat.repository.ln.UserRepository;
import com.cofat.magasincofat.security.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
@Component
public class JwtService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    JwtUtil jwtUtil;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user =userRepository.findUserByUsername(username);
        if (user !=null){
            return new org.springframework.security.core.userdetails.User(
                    user.getUsername(),
                    user.getPassword(),
                    getAuthorities(user)
            );
        }else{
            throw new UsernameNotFoundException("user not found");
        }
    }

    private Set getAuthorities(User user){
        Set authoroties = new HashSet();
        user.getRoles().forEach(role -> {
            authoroties.add(new SimpleGrantedAuthority(role.getRoleName()));
        });
        return authoroties;
    }

}

 */
