package com.xueda.food.controller.admin;

import com.xueda.food.model.entity.MaterialCategory;
import com.xueda.food.service.MaterialCategoryService;
import com.xueda.food.utils.JsonData;
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
