package com.food.foodService.filter;

import java.util.HashSet;
import java.util.Set;

public class CachedFoodFilterMock extends CachedFoodFilter {

	public CachedFoodFilterMock() {
 
		Set<String> cachedFoodName = new HashSet<String>();
		cachedFoodName.add("RAVIOLI");
		this.cachedFoodName = cachedFoodName;
	}
	
}
