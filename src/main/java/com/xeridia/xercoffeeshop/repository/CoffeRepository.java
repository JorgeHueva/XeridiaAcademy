package com.xeridia.xercoffeeshop.repository;

import com.xeridia.xercoffeeshop.tablas.Coffe;
import org.springframework.data.repository.CrudRepository;

public interface CoffeRepository extends CrudRepository<Coffe, String> {
}