package com.xueda.food.service;

import com.xueda.food.model.entity.AuthUserDetails;

import org.apache.ibatis.annotations.Param;

public interface AuthUserDetailsService {
    AuthUserDetails findByUserName(@Param("username") String username);
}