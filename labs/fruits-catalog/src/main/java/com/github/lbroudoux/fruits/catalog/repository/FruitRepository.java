package com.github.lbroudoux.fruits.catalog.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.github.lbroudoux.fruits.catalog.domain.Fruit;

/**
 * A customized repository insterface for persisting Fruits.
 * @author laurent
 */
public interface FruitRepository extends MongoRepository<Fruit, String> {

}
