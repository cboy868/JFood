package com.xueda.food.controller.admin;

import javax.annotation.Resource;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {


    @Resource
    PasswordEncoder passwordEncoder;

    @GetMapping("/hello")
    @ResponseBody
    public String hello()
    {

        return "hello";

    }

    @GetMapping("/wansq")
    @ResponseBody
    public String wansq()
    {
        return "It's me wansq";
    }
    
}