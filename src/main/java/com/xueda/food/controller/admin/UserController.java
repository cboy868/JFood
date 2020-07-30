package com.xueda.food.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello()
    {
        return "hello user";
    }

    @GetMapping("/world")
    @ResponseBody
    public String world()
    {
        return "world";
    }


    @GetMapping("/wansq")
    @ResponseBody
    public String wansq()
    {
        return "It's me wansq";
    }
    
}