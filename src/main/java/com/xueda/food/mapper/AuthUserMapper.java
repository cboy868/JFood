package com.xueda.food.mapper;

import java.util.List;

import com.xueda.food.model.entity.AuthUser;
// import com.xueda.food.model.entity.AuthUserDetails;

public interface AuthUserMapper {
    List<AuthUser> list();

    // AuthUserDetails findByUserName(String username);
}