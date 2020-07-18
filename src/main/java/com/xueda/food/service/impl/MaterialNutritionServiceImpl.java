package com.xueda.food.service.impl;

import com.xueda.food.mapper.MaterialNutritionMapper;
import com.xueda.food.service.MaterialNutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialNutritionServiceImpl implements MaterialNutritionService {

    @Autowired
    private MaterialNutritionMapper materialNutritionMapper;
}
