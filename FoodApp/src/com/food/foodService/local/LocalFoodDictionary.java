package com.food.foodService.local;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.food.foodService.FoodDictionary;
import com.food.foodService.domain.FoodObject;

public class LocalFoodDictionary implements FoodDictionary {

	public LocalFoodDictionary() {
		init();
	}

	Map<String, FoodObject> cachedFoodObjectMap;

	protected void init() {

	}

	// Testing only
	@Override
	public Map<String, FoodObject> lookUpFood(String name) {
		Map<String, FoodObject> result = new HashMap<String, FoodObject>();
		if (cachedFoodObjectMap.containsKey(name)) {
			result.put(name, cachedFoodObjectMap.get(name));
		}
		return result;
	}

	@Override
	public Map<String, FoodObject> lookUpFoodByCollection(Collection<String> names) {
		Map<String, FoodObject> result = new HashMap<String, FoodObject>();
		for (String name : names) {
			if (cachedFoodObjectMap.containsKey(name)) {
				result.put(name, cachedFoodObjectMap.get(name));
			}
		}
		return result;
	}

	@Override
	public boolean isValidFood(String name) {
		return this.cachedFoodObjectMap.containsKey(name);
	}
}
