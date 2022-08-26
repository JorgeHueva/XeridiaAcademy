package com.xeridia.xercoffeeshop.repository;

import com.xeridia.xercoffeeshop.tablas.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, String> {
}