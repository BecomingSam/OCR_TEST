package com.food.foodService.filter;

import java.util.HashMap;
import java.util.Map;

import com.food.foodService.domain.FoodObject;

public class CachedFoodFilterMock implements ValidFoodFilter {

	Map<String, FoodObject> cachedFoodObjectMap;

	public CachedFoodFilterMock() {
 
		Map<String, FoodObject> cachedMap = new HashMap<String, FoodObject>();
		cachedMap.put("RAVIOLI", new FoodObject("Ravioli", "A type of Pasta"));
		this.cachedFoodObjectMap = cachedMap;
	}
	
	@Override
	public boolean isValidFood(String name) {
		return this.cachedFoodObjectMap.containsKey(name);
	}

}
