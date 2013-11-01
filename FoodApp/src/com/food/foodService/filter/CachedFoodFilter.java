package com.food.foodService.filter;

import java.util.Map;

import com.food.foodService.domain.FoodObject;

public class CachedFoodFilter implements ValidFoodFilter {

	Map<String, FoodObject> cachedFoodObjectMap;

	public CachedFoodFilter() {
		//TODO: some db to iniatialize
		//this.cachedFoodObjectMap = cachedFoodObjectMap;
	}
	
	@Override
	public boolean isValidFood(String name) {
		return this.cachedFoodObjectMap.containsKey(name);
	}

}
