package com.xueda.food.controller;

import com.xueda.food.service.MaterialCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("material_category")
public class MaterialCategoryController {

    @Autowired
    private MaterialCategoryService materialCategoryService;


    @RequestMapping("list")
    public Object list()
    {
        return materialCategoryService.list();
    }
}
