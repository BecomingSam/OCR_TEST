package com.food.foodService.dictionary;

import java.util.Collection;
import java.util.Set;

import com.food.foodService.domain.FoodObject;

public interface FoodDictionary {
	
	public FoodObject lookUpFood(String name);
	public Set<FoodObject> lookUpFoodByCollection(Collection<String> names);
}
