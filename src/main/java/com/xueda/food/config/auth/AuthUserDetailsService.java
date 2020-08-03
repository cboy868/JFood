package com.xueda.food.config.auth;

import com.xueda.food.mapper.AuthUserDetailsMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class AuthUserDetailsService implements UserDetailsService {

    @Autowired
    private AuthUserDetailsMapper authUserDetailsMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return authUserDetailsMapper.findByUserName(username);
    }
    
}