package com.xueda.food.material.service.impl;

import com.xueda.food.material.mapper.MaterialNutritionTypeMapper;
import com.xueda.food.material.service.MaterialNutritionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialNutritionTypeServiceImpl implements MaterialNutritionTypeService {

    @Autowired
    private MaterialNutritionTypeMapper materialNutritionTypeMapper;
}
