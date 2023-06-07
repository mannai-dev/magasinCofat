package com.cofat.magasincofat.security.util;
/*
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;

import java.security.Key;
import java.util.Date;
import java.util.Optional;

import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.cofat.magasincofat.entity.RefreshToken;
import io.jsonwebtoken.impl.crypto.MacProvider;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {
    private static final long Token_Validity =3600*60*15;
    private static final long Token_Refresh_Validity =6000*60*90;

    private Algorithm accessTokenAlgorithm;
    private Algorithm refreshTokenAlgorithm;
    private JWTVerifier accessTokenVerifier;
    private JWTVerifier refreshTokenVerifier;
    private static final Key SECRET_KEY= MacProvider.generateKey();
    private static final Key SECRET_REFRESH_KEY= MacProvider.generateKey();
    public JwtUtil() {

        accessTokenAlgorithm = Algorithm.HMAC256(String.valueOf(SECRET_KEY));
        refreshTokenAlgorithm = Algorithm.HMAC256(String.valueOf(SECRET_REFRESH_KEY));
        accessTokenVerifier = JWT.require(accessTokenAlgorithm)

                .build();
        refreshTokenVerifier = JWT.require(refreshTokenAlgorithm)

                .build();
    }
    /*
     *Acess token functions
     */
/*
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

    public String generateRefreshToken(UserDetails userDetails, RefreshToken refreshToken) {
        return JWT.create()
                .withSubject(userDetails.getUsername())
                .withClaim("tokenId", refreshToken.getId())
                .withIssuedAt(new Date(System.currentTimeMillis()))
                .withExpiresAt(new Date(System.currentTimeMillis() +Token_Refresh_Validity))
                .sign(refreshTokenAlgorithm);
    }
    private Optional<DecodedJWT> decodeRefreshToken(String token) {
        try {
            return Optional.of(refreshTokenVerifier.verify(token));
        } catch (JWTVerificationException e) {
            throw new JWTVerificationException("invalid refresh token"+ e);
        }
    }

    public boolean validateRefreshToken(String token) {
        return decodeRefreshToken(token).isPresent();
    }


    public String getUserNameFromRefreshToken(String token) {
        return decodeRefreshToken(token).get().getSubject();
    }

    public String getTokenIdFromRefreshToken(String token) {
        return String.valueOf(decodeRefreshToken(token).get().getClaim("tokenId"));
    }

}

 */
