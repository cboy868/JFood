package com.xueda.food.controller;

import com.xueda.food.service.MaterialCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaterialCategoryController {

    @Autowired
    private MaterialCategoryService materialCategoryService;
}
