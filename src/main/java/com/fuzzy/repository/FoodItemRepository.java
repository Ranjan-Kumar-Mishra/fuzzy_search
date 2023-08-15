package com.fuzzy.repository;

import com.fuzzy.Entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.regex.Pattern;


public interface FoodItemRepository extends JpaRepository<FoodItem ,Long> {

    // Add custom query methods if needed
}