package com.food.foodService;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.food.foodService.domain.FoodObject;

public interface FoodDictionary {
	
	public boolean isValidFood(String name);
	public Map<String, FoodObject> lookUpFood(String name);
	public Map<String, FoodObject> lookUpFoodByCollection(Collection<String> names);
}
