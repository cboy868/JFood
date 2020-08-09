package com.xueda.food.auth.dao;

import com.xueda.food.auth.model.AuthUsers;
import java.util.List;

public interface AuthUsersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AuthUsers record);

    AuthUsers selectByPrimaryKey(Long id);

    List<AuthUsers> selectAll();

    int updateByPrimaryKey(AuthUsers record);
}