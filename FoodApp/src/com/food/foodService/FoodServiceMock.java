package com.food.foodService;

import com.food.foodService.dictionary.LocalFoodDictionaryMock;
import com.food.foodService.filter.CachedFoodFilter;

public class FoodServiceMock extends FoodService {

	public FoodServiceMock()
	{
		super();
		this.foodDictionary = new LocalFoodDictionaryMock();
		this.validFoodFilter = new CachedFoodFilter();
	}
}
