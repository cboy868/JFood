package com.xueda.food.service.impl;

import com.xueda.food.mapper.MaterialMapper;
import com.xueda.food.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialMapper materialMapper;
}
