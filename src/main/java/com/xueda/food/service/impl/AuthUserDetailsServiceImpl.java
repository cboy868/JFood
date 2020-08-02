package com.xueda.food.service.impl;

import com.xueda.food.mapper.AuthUserDetailsMapper;
import com.xueda.food.model.entity.AuthUserDetails;
import com.xueda.food.service.AuthUserDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthUserDetailsServiceImpl implements AuthUserDetailsService {


    @Autowired
    private AuthUserDetailsMapper authUserDetailsMapper;


    @Override
    public AuthUserDetails findByUserName(String username) {
        return authUserDetailsMapper.findByUserName(username);
    }
    
}