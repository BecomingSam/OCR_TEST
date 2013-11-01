package com.food.foodService.dictionary;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.food.foodService.domain.FoodObject;


public class FreebaseDictionary implements FoodDictionary {

	@Override
	public FoodObject lookUpFood(String name) {
		return this.callFreebaseWebService(name);
	}

	@Override
	public Set<FoodObject> lookUpFoodByCollection(Collection<String> names) {
		Set<FoodObject> resultSet = new HashSet<FoodObject>();
		for (String s : names)
		{
			resultSet.add(this.lookUpFood(s));
		}
		return resultSet;
	}
	
	private FoodObject callFreebaseWebService(String name) {
		String url = this.generateRequestURL(name);
		//Request
		
		//Parse Json
		
		return null;
	}

	private String generateRequestURL(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private FoodObject convertJSONToFoodObject()
	{
		return null;
	}

	
}
