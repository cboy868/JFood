package com.xueda.food.mapper;

import com.xueda.food.model.entity.AuthUserDetails;

public interface AuthUserDetailsMapper {
    AuthUserDetails findByUserName(String username);
}