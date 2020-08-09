package com.xueda.food.auth.dao;

import com.xueda.food.auth.model.AuthRolePermissionsRel;
import java.util.List;

public interface AuthRolePermissionsRelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AuthRolePermissionsRel record);

    AuthRolePermissionsRel selectByPrimaryKey(Integer id);

    List<AuthRolePermissionsRel> selectAll();

    int updateByPrimaryKey(AuthRolePermissionsRel record);
}