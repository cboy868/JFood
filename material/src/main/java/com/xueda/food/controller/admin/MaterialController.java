package com.xueda.food.controller.admin;

import com.xueda.food.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/pri/material")
@Component("PriMaterial")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @RequestMapping("list")
    public Object list()
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 12);
        return  map;
    }
}
