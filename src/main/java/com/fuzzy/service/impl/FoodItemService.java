package com.fuzzy.service.impl;

import com.fuzzy.Entity.FoodItem;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FoodItemService {
    List<FoodItem> getAllFoodItems();

    FoodItem getFoodItemById(long id);

    void createFoodItem(FoodItem foodItem);

    // More methods for updating and deleting food items
}

