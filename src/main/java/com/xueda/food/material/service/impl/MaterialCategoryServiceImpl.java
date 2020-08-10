package com.xueda.food.material.service.impl;

import com.xueda.food.material.model.MaterialCategory;
import com.xueda.food.material.dao.MaterialCategoryMapper;
import com.xueda.food.material.service.MaterialCategoryService;
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
