package com.xueda.food.service.impl;

import java.util.List;

import com.xueda.food.mapper.AuthUserMapper;
import com.xueda.food.model.entity.AuthUser;
// import com.xueda.food.model.entity.AuthUserDetails;
import com.xueda.food.service.AuthUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthUserServiceImpl implements AuthUserService {

    @Autowired
    private AuthUserMapper authUserMapper; 

    @Override
    public List<AuthUser> list() {
        return authUserMapper.list();
    }

    // @Override
    // public AuthUserDetails findByUserName(String username) {
    //     return authUserMapper.findByUserName(username);
    // }
    
}