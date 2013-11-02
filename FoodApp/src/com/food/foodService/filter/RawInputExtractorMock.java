package com.food.foodService.filter;

import java.util.Arrays;
import java.util.List;

import com.food.constants.FoodConstants;

public class RawInputExtractorMock extends RawInputExtractor{

		public List<String> extractWordList(String rawInput) {
		return Arrays.asList(rawInput.split(FoodConstants.INPUT_SPLIT_REGX));
	}

}
