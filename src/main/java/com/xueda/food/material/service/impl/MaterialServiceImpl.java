package com.xueda.food.material.service.impl;

import com.xueda.food.material.mapper.MaterialMapper;
import com.xueda.food.material.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialMapper materialMapper;
}
