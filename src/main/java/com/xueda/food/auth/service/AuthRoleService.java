package com.xueda.food.auth.service;

import java.util.List;

import com.xueda.food.auth.model.AuthRoles;

public interface AuthRoleService {
    
    List<AuthRoles> list();

    int insert(AuthRoles record);

    AuthRoles selectRoleById(Integer id);
}