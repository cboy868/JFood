package com.xueda.food.material.controller;

import com.xueda.food.material.model.MaterialCategory;
import com.xueda.food.material.service.MaterialCategoryService;
import com.xueda.food.core.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/pri/material_category")
public class MaterialCategoryController {

    @Autowired
    private MaterialCategoryService materialCategoryService;

    @RequestMapping("list")
    public JsonData list()
    {
        List<MaterialCategory> list = materialCategoryService.list();
        return JsonData.success(list);
    }
}
