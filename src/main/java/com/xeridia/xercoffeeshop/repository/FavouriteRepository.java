package com.xeridia.xercoffeeshop.repository;

import com.xeridia.xercoffeeshop.Favourite;
import org.springframework.data.repository.CrudRepository;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public interface FavouriteRepository extends CrudRepository<Favourite, Long> {
    List<Favourite> findByClient_EmailLike(String email);

}
