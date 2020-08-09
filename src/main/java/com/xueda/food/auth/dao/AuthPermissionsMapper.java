package com.xueda.food.auth.dao;

import com.xueda.food.auth.model.AuthPermissions;
import java.util.List;

public interface AuthPermissionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AuthPermissions record);

    AuthPermissions selectByPrimaryKey(Integer id);

    List<AuthPermissions> selectAll();

    int updateByPrimaryKey(AuthPermissions record);
}