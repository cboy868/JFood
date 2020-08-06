package com.xueda.food.auth.mapper;

import com.xueda.food.auth.model.AuthUserDetails;

public interface AuthUserDetailsMapper {
    AuthUserDetails findByUserName(String username);
}
