package com.xueda.food.auth.controller;

import com.xueda.food.core.utils.JsonData;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/auth/test")
    public JsonData index() {
        return JsonData.success();
    }
    
}