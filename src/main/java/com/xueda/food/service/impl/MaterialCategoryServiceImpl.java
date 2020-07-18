package com.xueda.food.service.impl;

import com.xueda.food.mapper.MaterialCategoryMapper;
import com.xueda.food.service.MaterialCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialCategoryServiceImpl implements MaterialCategoryService {

    @Autowired
    private MaterialCategoryMapper materialCategoryMapper;
}
