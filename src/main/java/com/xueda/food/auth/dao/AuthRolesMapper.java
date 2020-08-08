package com.xueda.food.auth.dao;

import com.xueda.food.auth.model.AuthRoles;
import java.util.List;

public interface AuthRolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AuthRoles record);

    AuthRoles selectByPrimaryKey(Integer id);

    List<AuthRoles> selectAll();

    int updateByPrimaryKey(AuthRoles record);
}