package com.food.foodService;

import com.food.foodService.dictionary.LocalFoodDictionaryMock;
import com.food.foodService.filter.CachedFoodFilterMock;

public class FoodServiceMock extends FoodService {

	public FoodServiceMock()
	{
		super();
		this.foodDictionary = new LocalFoodDictionaryMock();
		this.validFoodFilter = new CachedFoodFilterMock();
	}
}
