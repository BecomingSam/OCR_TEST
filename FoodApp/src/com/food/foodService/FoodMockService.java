package com.food.foodService;

import java.util.Collection;
import java.util.Map;

import com.food.foodService.domain.FoodObject;
import com.food.foodService.local.LocalFoodDictionaryMock;

public class FoodMockService extends FoodService {

	public FoodMockService()
	{
		this.foodDictionary = new LocalFoodDictionaryMock();
	}

	@Override
	protected Map<String, FoodObject> generateFoodMap(Collection<String> validFoodNames) {
		return this.foodDictionary.lookUpFoodByCollection(validFoodNames);
	}

}
