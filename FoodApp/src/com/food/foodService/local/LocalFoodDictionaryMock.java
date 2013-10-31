package com.food.foodService.local;

import java.util.HashMap;
import java.util.Map;

import com.food.foodService.domain.FoodObject;

public class LocalFoodDictionaryMock extends LocalFoodDictionary {

	@Override
	protected void init()
	{
		this.cachedFoodObjectMap = getDummyFoodObjectMap();
	}
	
	private Map<String, FoodObject> getDummyFoodObjectMap() {
		
		Map<String, FoodObject> result = new HashMap<String, FoodObject>();
		result.put("RAVIOLI", new FoodObject("Ravioli", "A type of Pasta"));
		return result;
	}
}
