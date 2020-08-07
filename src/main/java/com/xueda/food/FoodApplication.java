package com.xueda.food;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.xueda.food.material.mapper","com.xueda.food.auth.mapper"})
public class FoodApplication{

	public static void main(String[] args) {
		SpringApplication.run(FoodApplication.class, args);
	}

}
