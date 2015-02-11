package com.example.client;

public class FoodEntity {
	
	private String foodItem;
	private String foodPrice;
	
	public FoodEntity(String foodItem,String foodPrice)
	{
		this.setFoodItem(foodItem);
		this.setFoodPrice(foodPrice);
	}

	String getFoodItem() {
		return foodItem;
	}

	void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	String getFoodPrice() {
		return foodPrice;
	}

	void setFoodPrice(String foodPrice) {
		this.foodPrice = foodPrice;
	}

}
