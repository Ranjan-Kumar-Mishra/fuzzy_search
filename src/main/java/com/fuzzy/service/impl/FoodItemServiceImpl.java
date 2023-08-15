package com.fuzzy.service.impl;

import com.fuzzy.Entity.FoodItem;
import com.fuzzy.repository.FoodItemRepository;
import com.fuzzy.service.impl.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemServiceImpl implements FoodItemService {

    private final
    FoodItemRepository foodItemRepository;

    @Autowired
    public FoodItemServiceImpl(FoodItemRepository foodItemRepository) {

        this.foodItemRepository = foodItemRepository;
    }

    @Override
    public List<FoodItem> getAllFoodItems() {

        return foodItemRepository.findAll();
    }

    @Override
    public FoodItem getFoodItemById(long id) {
        FoodItem foodItem = foodItemRepository.findById(id).orElse(null);
        return foodItem;
    }

    @Override
    public void createFoodItem(FoodItem foodItem) {

        foodItemRepository.save(foodItem);
    }

    // Implement methods for updating and deleting food items
}
