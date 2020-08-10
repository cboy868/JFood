package com.xueda.food.material.service.impl;

import com.xueda.food.material.dao.MaterialNutritionMapper;
import com.xueda.food.material.service.MaterialNutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialNutritionServiceImpl implements MaterialNutritionService {

    @Autowired
    private MaterialNutritionMapper materialNutritionMapper;
}
