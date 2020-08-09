package com.xueda.food.auth.service.impl;

import java.util.List;

import com.xueda.food.auth.dao.AuthRolesMapper;
import com.xueda.food.auth.model.AuthRoles;
import com.xueda.food.auth.service.AuthRoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthRolesServiceImpl implements AuthRoleService {

    @Autowired
    AuthRolesMapper authRolesMapper;

    @Override
    public List<AuthRoles> list() {
        return authRolesMapper.selectAll();
    }
    
}