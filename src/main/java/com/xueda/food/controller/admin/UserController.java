package com.xueda.food.controller.admin;

import java.util.List;

import javax.annotation.Resource;

import com.xueda.food.model.entity.AuthUser;
import com.xueda.food.service.AuthUserService;
import com.xueda.food.utils.JsonData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {


    @Autowired
    private AuthUserService authUserService;

    @Resource
    PasswordEncoder passwordEncoder;

    @GetMapping("/hello")
    @ResponseBody
    public String hello()
    {

        return "hello";

    }

    @GetMapping("/world")
    @ResponseBody
    public JsonData world()
    {
        List<AuthUser> list = authUserService.list();
        return JsonData.success(list);
    }


    @GetMapping("/wansq")
    @ResponseBody
    public String wansq()
    {
        return "It's me wansq";
    }
    
}