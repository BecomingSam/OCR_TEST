package com.food.ocr.utils;

import com.food.constants.OCRConstants;
import com.food.ocr.OCRApiService;
import com.food.ocr.OCRService;

public class OCRServiceFunctionalUnit {
	
	public static void main(String[] args)
	{
		OCRService service = new OCRApiService();
		String result = service.convertToText(OCRConstants.LANGUAGE_ENGLISH, "C:/test.jpg");
		System.out.print(result);
	}
}
