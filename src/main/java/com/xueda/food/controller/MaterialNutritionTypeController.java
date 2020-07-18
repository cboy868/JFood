package com.xueda.food.controller;

import com.xueda.food.service.MaterialNutritionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaterialNutritionTypeController {

    @Autowired
    private MaterialNutritionTypeService materialNutritionTypeService;
}
