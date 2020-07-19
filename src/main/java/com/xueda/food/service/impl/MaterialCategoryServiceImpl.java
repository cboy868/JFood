package com.xueda.food.service.impl;

import com.xueda.food.model.entity.MaterialCategory;
import com.xueda.food.mapper.MaterialCategoryMapper;
import com.xueda.food.service.MaterialCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialCategoryServiceImpl implements MaterialCategoryService {

    @Autowired
    private MaterialCategoryMapper materialCategoryMapper;

    @Override
    public List<MaterialCategory> list() {
        return materialCategoryMapper.list();
    }
}
