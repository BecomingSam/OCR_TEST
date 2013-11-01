package com.food.foodService.dictionary;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.food.foodService.domain.FoodObject;

public class LocalFoodDictionary implements FoodDictionary {

	public LocalFoodDictionary() {
		init();
	}

	Map<String, FoodObject> cachedFoodObjectMap;

	protected void init() {
		//TODO prepopulate cached food object map
	}

	// Testing only
	@Override
	public FoodObject lookUpFood(String name) {
		if (cachedFoodObjectMap.containsKey(name)) {
			return cachedFoodObjectMap.get(name);
			//TODO: fall back to db
		}
		else return null;
	}

	@Override
	public Set<FoodObject> lookUpFoodByCollection(Collection<String> names) {
		Set<FoodObject> result = new HashSet<FoodObject>();
		for (String name : names) {
			if (cachedFoodObjectMap.containsKey(name)) {
				result.add(cachedFoodObjectMap.get(name));
				//TODO: fall back to db
			}
		}
		return result;
	}
}
