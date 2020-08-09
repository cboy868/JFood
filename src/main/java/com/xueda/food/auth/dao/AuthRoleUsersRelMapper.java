package com.xueda.food.auth.dao;

import com.xueda.food.auth.model.AuthRoleUsersRel;
import java.util.List;

public interface AuthRoleUsersRelMapper {
    int insert(AuthRoleUsersRel record);

    List<AuthRoleUsersRel> selectAll();
}