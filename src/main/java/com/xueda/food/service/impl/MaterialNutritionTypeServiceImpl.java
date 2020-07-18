package com.xueda.food.service.impl;

import com.xueda.food.mapper.MaterialNutritionTypeMapper;
import com.xueda.food.service.MaterialNutritionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialNutritionTypeServiceImpl implements MaterialNutritionTypeService {

    @Autowired
    private MaterialNutritionTypeMapper materialNutritionTypeMapper;
}
