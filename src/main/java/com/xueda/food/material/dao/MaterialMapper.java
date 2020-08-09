package com.xueda.food.material.dao;

import com.xueda.food.material.model.Material;
import java.util.List;

public interface MaterialMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Material record);

    Material selectByPrimaryKey(Long id);

    List<Material> selectAll();

    int updateByPrimaryKey(Material record);
}