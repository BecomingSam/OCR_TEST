package com.food.foodService.domain;

public class FoodObject {

	public FoodObject(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	private String name;
	private String description;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
