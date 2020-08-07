package com.xueda.food.auth.service.impl;

import com.xueda.food.auth.mapper.AuthUserDetailsMapper;
import com.xueda.food.auth.model.AuthUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthUserDetailsServiceImpl{

    @Autowired
    private AuthUserDetailsMapper authUserDetailsMapper; 

    public AuthUserDetails findByUserName(String username) {
        return authUserDetailsMapper.findByUserName(username);
    }
    
}