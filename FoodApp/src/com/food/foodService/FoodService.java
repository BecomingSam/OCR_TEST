package com.food.foodService;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.food.constants.FoodConstants;
import com.food.foodService.dictionary.FoodDictionary;
import com.food.foodService.dictionary.LocalFoodDictionary;
import com.food.foodService.domain.FoodObject;
import com.food.foodService.filter.CachedFoodFilter;
import com.food.foodService.filter.RawInputExtractor;
import com.food.foodService.filter.ValidFoodFilter;

public class FoodService {

	protected ValidFoodFilter validFoodFilter;
	protected FoodDictionary foodDictionary;
	
	public FoodService() {
		this.validFoodFilter = new CachedFoodFilter();
		this.foodDictionary = new LocalFoodDictionary();
	}
	
	public Set<FoodObject> getFoodList(String rawInput) {
		Set<String> validFoodNames = this.filterRawInput(rawInput);
		return this.generateFoodObjectSet(validFoodNames);
	}

	protected Set<FoodObject> generateFoodObjectSet(Collection<String> validFoodNames) {
		Set<FoodObject> foodObjectSet = this.foodDictionary.lookUpFoodByCollection(validFoodNames);
		return foodObjectSet;
	}

	protected Set<String> filterRawInput(String rawInput) {
		Set<String> outputList = new HashSet<String>();
		List<String> inputList = new RawInputExtractor().extractWordList(rawInput);
		for (String s : inputList)
		{
			if (this.validFoodFilter.isValidFood(s))
			{
				outputList.add(s);
			}
		}
		return outputList;
	}

}
