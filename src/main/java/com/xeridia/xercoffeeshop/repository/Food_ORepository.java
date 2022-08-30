package com.xeridia.xercoffeeshop.repository;

import com.xeridia.xercoffeeshop.tablas.Food_O;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface Food_ORepository extends CrudRepository<Food_O, Long> {
}