package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface CountryRepository extends CrudRepository<Country, String > {
    Iterable <Country> findAllById(Iterable<String> strings);
}