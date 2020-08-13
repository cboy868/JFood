package com.xueda.food.auth.dao;

import com.xueda.food.auth.model.AuthRoles;
import java.util.List;

public interface AuthRolesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_roles
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_roles
     *
     * @mbg.generated
     */
    int insert(AuthRoles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_roles
     *
     * @mbg.generated
     */
    AuthRoles selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_roles
     *
     * @mbg.generated
     */
    List<AuthRoles> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_roles
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AuthRoles record);


    AuthRoles selectRoleById(Integer id);
}