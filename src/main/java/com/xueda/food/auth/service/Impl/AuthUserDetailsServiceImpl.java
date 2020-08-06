package com.xueda.food.auth.service.Impl;

// import java.util.List;

// import com.xueda.food.model.entity.AuthUser;
import com.xueda.food.auth.mapper.AuthUserDetailsMapper;
import com.xueda.food.auth.model.AuthUserDetails;
// import com.xueda.food.service.AuthUserService;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
import org.springframework.stereotype.Service;


@Service
public class AuthUserDetailsServiceImpl{

    @Autowired
    private AuthUserDetailsMapper authUserDetailsMapper; 

    // @Override
    // public List<AuthUser> list() {
    //     return authUserMapper.list();
    // }

    public AuthUserDetails findByUserName(String username) {
        return authUserDetailsMapper.findByUserName(username);
    }
    
}