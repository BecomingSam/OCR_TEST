package com.food.foodService.dictionary;

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
		result.put("RAVIOLI", new FoodObject("RAVIOLI", "A type of Pasta", "https://usercontent.googleapis.com/freebase/v1/image/m/02nqg_h"));
		return result;
	}
}
