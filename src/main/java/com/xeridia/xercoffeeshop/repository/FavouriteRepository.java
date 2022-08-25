package com.xeridia.xercoffeeshop.repository;

import com.xeridia.xercoffeeshop.tablas.Favourite;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FavouriteRepository extends CrudRepository<Favourite, Long> {
    List<Favourite> findByClient_EmailLike(String email);

}
