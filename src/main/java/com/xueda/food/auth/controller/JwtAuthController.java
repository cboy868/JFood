package com.xueda.food.auth.controller;

import java.util.Map;

import javax.annotation.Resource;

import com.xueda.food.auth.service.JwtAuthService;
import com.xueda.food.core.utils.JsonData;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtAuthController {

    @Resource
    JwtAuthService jwtAuthService;

    @RequestMapping(value="/authentication")
    public JsonData login(@RequestBody Map<String, String> map) {
        String name = map.get("username");
        String password = map.get("password");

        if(StringUtils.isEmpty(name) || StringUtils.isEmpty(password)) {
            return JsonData.error("用户名或密码不能为空");
        }

        try {
            return JsonData.success(jwtAuthService.ligin(name, password));
        } catch (Exception e) {
            return JsonData.error(e.getMessage());
        }
    }

    @RequestMapping(value="/refreshtoken")
    public JsonData refresh(@RequestHeader("${jwt.header}") String token){
        String tk = jwtAuthService.refreshToken(token);

        return JsonData.success(tk);
    }
    
}