package com.lambdaexpressions.ecommerce;

//Product class to store details of items
public class Product {
	
	//Instance of product
	String name;
	double price;
	double rating;
	double discount;
	
	//Parameterized Constructor
	public Product(String name, double price, double rating, double discount) {
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.discount = discount;
	}
	
	//Getter method to get item details
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public double getRating() {
		return rating;
	}
	public double getDiscount() {
		return discount;
	}
	
	
	

}
