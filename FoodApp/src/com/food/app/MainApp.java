package com.food.app;

import java.util.Map;

import com.food.foodService.FoodMockService;
import com.food.foodService.FoodService;
import com.food.foodService.domain.FoodObject;
import com.food.ocr.OCRMockService;
import com.food.ocr.OCRService;

public class MainApp {

	public static void main(String[] args) {
		// OCRService service = new OCRApiService();

		OCRService ocrService = new OCRMockService();
		String result = ocrService.convertToText("en", "C:/test.jpg");

		FoodService foodService = new FoodMockService();
		Map<String, FoodObject> foodMap = foodService.getFoodList(result);

		for (String a : foodMap.keySet()) {
			System.out.println(a + " " + foodMap.get(a).getDescription());
		}
	}

}
