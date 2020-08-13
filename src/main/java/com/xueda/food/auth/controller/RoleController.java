package com.xueda.food.auth.controller;

import java.util.List;

import com.xueda.food.auth.model.AuthRoles;
import com.xueda.food.auth.service.AuthRoleService;
import com.xueda.food.core.utils.JsonData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/pri/auth_role")
public class RoleController {

    @Autowired
    AuthRoleService authRoleService;

    @RequestMapping("list")
    public JsonData list() {
        List<AuthRoles> list = authRoleService.list();
        return JsonData.success(list);
    }


    @RequestMapping("save")
    public JsonData insert() {
        // AuthRoles authRoles = new AuthRoles();
        // authRoles.setId(2);
        // authRoles.setName("管理员");
        // Integer id = authRoleService.insert(authRoles);



        AuthRoles authroles = authRoleService.selectRoleById(1);

        return JsonData.success(authroles);

    }
}