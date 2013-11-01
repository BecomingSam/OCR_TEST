package com.food.app;

import java.util.Set;

import com.food.foodService.FoodService;
import com.food.foodService.FoodServiceMock;
import com.food.foodService.domain.FoodObject;
import com.food.ocr.OCRService;
import com.food.ocr.OCRServiceMock;

public class MainApp {

	public static void main(String[] args) {
		// OCRService service = new OCRApiService();

		OCRService ocrService = new OCRServiceMock();
		String result = ocrService.convertToText("en", "C:/test.jpg");

		FoodService foodService = new FoodServiceMock();
		Set<FoodObject> foodObjectSet = foodService.getFoodList(result);

		for (FoodObject a : foodObjectSet) {
			System.out.println(a.getName() + " " + a.getDescription() + " " + a.getImageLocation());
		}
	}

}
