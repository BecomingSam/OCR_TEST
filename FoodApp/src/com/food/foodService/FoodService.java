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
import com.food.foodService.imageService.FreebaseImageService;
import com.food.foodService.imageService.ImageService;

public class FoodService {

	public FoodService() {
		this.foodDictionary = new LocalFoodDictionary();
		this.imageService = new FreebaseImageService();
	}

	protected FoodDictionary foodDictionary;
	protected ImageService imageService;
	
	public Set<FoodObject> getFoodList(String rawInput) {
		Set<String> validFoodNames = this.filterRawInput(rawInput);
		return this.generateFoodMap(validFoodNames);
	}

	protected Set<FoodObject> generateFoodMap(Collection<String> validFoodNames) {
		Set<FoodObject> foodMap = this.foodDictionary.lookUpFoodByCollection(validFoodNames);
		this.enrichFoodMapWithImage(foodMap);
		return foodMap;
	}

	private void enrichFoodMapWithImage(Set<FoodObject> foodMap) {
		for (FoodObject food : foodMap)
		{
			food.setImageLocation(this.imageService.getImageLocation(food.getName()));
		}
	}

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
