package com.xueda.food.material.controller;

import com.xueda.food.material.service.MaterialNutritionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaterialNutritionTypeController {

    @Autowired
    private MaterialNutritionTypeService materialNutritionTypeService;
}
