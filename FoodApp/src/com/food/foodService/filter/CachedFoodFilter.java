package com.food.foodService.filter;

import java.util.Set;

public class CachedFoodFilter implements ValidFoodFilter {

	protected Set<String> cachedFoodName;

	public CachedFoodFilter() {
		//TODO: some db to iniatialize
		//this.cachedFoodObjectMap = cachedFoodObjectMap;
	}
	
	@Override
	public boolean isValidFood(String name) {
		return this.cachedFoodName.contains(name);
	}

}
