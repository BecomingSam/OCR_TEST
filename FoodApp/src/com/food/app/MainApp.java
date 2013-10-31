package com.food.app;

import com.food.ocr.OCRApiService;
import com.food.ocr.OCRService;

public class MainApp {

	public static void main(String[] args) {
		OCRService service = new OCRApiService();
		String result = service.convertToText("en", "C:/test.jpg");
		
		System.out.print(result);
	}

}
