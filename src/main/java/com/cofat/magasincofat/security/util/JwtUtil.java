package com.cofat.magasincofat.security.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import io.jsonwebtoken.impl.crypto.MacProvider;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

@Component
public class JwtUtil {

//    @Value("${security.jwtSecret}")
//    private String jwtSecret;
//
//    @Value("${security.jwtExpirationMs}")
//    private int jwtExpirationMs;
//
//    public String generateToken(UserDetails userDetails) {
//        Map<String, Object> claims = new HashMap<>();
//        return createToken(claims, userDetails.getUsername());
//    }
//
//    private String createToken(Map<String, Object> claims, String subject) {
//        return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
//                .setExpiration(new Date(System.currentTimeMillis() + jwtExpirationMs))
//                .signWith(SignatureAlgorithm.HS256, jwtSecret).compact();
//
//    }
//
//    public boolean validateToken(String token, UserDetails userDetails) {
//        final String username = extractUsername(token);
//        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
//    }
//
//    public String extractUsername(String token) {
//        return extractClaim(token, Claims::getSubject);
//    }
//
//    public Date extractExpirationDate(String token) {
//        return extractClaim(token, Claims::getExpiration);
//    }
//
//    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
//        final Claims claims = extractAllClaims(token);
//        return claimsResolver.apply(claims);
//    }
//
//    private Claims extractAllClaims(String token) {
//        return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody();
//    }
//
//    private boolean isTokenExpired(String token) {
//        final Date expiration = extractExpirationDate(token);
//        return expiration.before(new Date());
//    }
private static final long Token_Validity =3600*60*60;

    private Algorithm accessTokenAlgorithm;
    private JWTVerifier accessTokenVerifier;
    private static final Key SECRET_KEY= MacProvider.generateKey();
    public JwtUtil() {

        accessTokenAlgorithm = Algorithm.HMAC256(String.valueOf(SECRET_KEY));
        accessTokenVerifier = JWT.require(accessTokenAlgorithm).build();
    }
    /*
     *Acess token functions
     */
    private Optional<DecodedJWT> decodeAccessToken(String token) {
        try {
            return Optional.of(accessTokenVerifier.verify(token));
        } catch (JWTVerificationException e) {
            throw new JWTVerificationException("invalid access token"+ e);
        }
    }

    public String getUserNameFromToken(String token) {
        return decodeAccessToken(token).get().getSubject();
    }
    public boolean validateAccessToken(String token) {
        return decodeAccessToken(token).isPresent();
    }
    public String generateToken(UserDetails userDetails) {
        return JWT.create()
                .withSubject(userDetails.getUsername())
                .withIssuedAt(new Date(System.currentTimeMillis()))
                .withExpiresAt(new Date(System.currentTimeMillis() + Token_Validity))
                .sign(accessTokenAlgorithm);
    }



}



