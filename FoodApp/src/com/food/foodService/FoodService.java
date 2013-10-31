package com.food.foodService;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.food.foodService.domain.FoodObject;
import com.food.utils.FoodConstants;

public abstract class FoodService {

	protected FoodDictionary foodDictionary;
	
	public Map<String, FoodObject> getFoodList(String rawInput) {
		Set<String> validFoodNames = this.filterRawInput(rawInput);
		return this.generateFoodMap(validFoodNames);
	}

	protected abstract Map<String, FoodObject> generateFoodMap(Collection<String> validFoodNames);

	protected Set<String> filterRawInput(String rawInput) {
		Set<String> outputList = new HashSet<String>();
		List<String> inputList = Arrays.asList(rawInput.split(FoodConstants.INPUT_SPLIT_REGX));
		for (String s : inputList)
		{
			if (this.foodDictionary.isValidFood(s))
			{
				outputList.add(s);
			}
		}
		return outputList;
	}
}
