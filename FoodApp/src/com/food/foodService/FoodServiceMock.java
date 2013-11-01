package com.food.foodService;

import com.food.foodService.dictionary.LocalFoodDictionaryMock;
import com.food.foodService.imageService.ImageServiceMock;

public class FoodServiceMock extends FoodService {

	public FoodServiceMock()
	{
		super();
		this.foodDictionary = new LocalFoodDictionaryMock();
		this.imageService = new ImageServiceMock();
	}
}
