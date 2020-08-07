package com.xueda.food.material.controller;

import com.xueda.food.material.service.MaterialNutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaterialNutritionController {

    @Autowired
    private MaterialNutritionService materialNutritionService;
}
