package com.xueda.food.config.auth.jwt;

import javax.annotation.Resource;

import com.xueda.food.expection.CustomException;
import com.xueda.food.expection.CustomExceptionType;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


@Service
public class JwtAuthService {

    @Resource
    AuthenticationManager authenticationManager;

    @Resource
    UserDetailsService userDetailsService;

    @Resource
    JwtTokenUtil jwtTokenUtil;

    public String ligin(String username, String password) throws CustomException{
        try {
            UsernamePasswordAuthenticationToken upToken = 
            new UsernamePasswordAuthenticationToken(username, password);
    
            Authentication authentication = authenticationManager.authenticate(upToken);


            System.out.println(authentication.getDetails());

            SecurityContextHolder.getContext().setAuthentication(authentication);

        } catch (AuthenticationException e) {

            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, e.getMessage());
        } 

        UserDetails userDetails = userDetailsService.loadUserByUsername(username);

        return jwtTokenUtil.generateToken(userDetails);
    }


    public String refreshToken(String oldToken) {

        if (!jwtTokenUtil.isTokenExpired(oldToken)) {
            return jwtTokenUtil.refreshToken(oldToken);
        }

        return null;
    }
}