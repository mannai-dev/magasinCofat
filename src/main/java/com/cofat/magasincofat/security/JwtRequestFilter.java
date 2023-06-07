package com.cofat.magasincofat.security;
/*
import com.cofat.magasincofat.security.util.JwtUtil;
import com.cofat.magasincofat.service.ln.JwtService;
import com.cofat.magasincofat.service.ln.UserService;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class JwtRequestFilter extends OncePerRequestFilter {
    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private JwtService jwtService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        if(request.getServletPath().equals("/auth/signin") || request.getServletPath().equals("/auth/refresh_token")){
            filterChain.doFilter(request,response);
        }

        final String header = request.getHeader("Authorization");

        String jwtToken=null;
        String userName=null;
        if(header !=null && header.startsWith("Bearer ")){
            jwtToken =header.substring(7);



            try {
                userName = jwtUtil.getUserNameFromToken(jwtToken);
            }catch (IllegalArgumentException e){
                throw new IllegalArgumentException("Unable to get Jwt Token ");

            }catch (ExpiredJwtException e){
                try {
                    throw new Exception("Expired Jwt Exception");
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

            }

        }else{

            System.out.println("JWT Token does not start with Bearer");
        }

        if(userName !=null && SecurityContextHolder.getContext().getAuthentication()==null){
            UserDetails userDetails= jwtService.loadUserByUsername(userName);

            if ( jwtUtil.validateAccessToken(jwtToken) ){

                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =new UsernamePasswordAuthenticationToken(
                        userDetails.getUsername(),
                        userDetails.getPassword(),
                        userDetails.getAuthorities() );

                usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            }
        }
        filterChain.doFilter(request,response);
    }
}


 */