package com.constructorandinstance.level1;

public class Product {
	
	//Declaring Instance Variable
	String productName;
	int price;
	// Initializing class variable
	static int totalProducts = 0;
	
	//Parameterized constructor
	Product(String productName, int price){
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	
	//Creating a instance method to display details
	void displayProductDetails() {
		System.out.println("Product Name => " + productName);
		System.out.println("Price => " + price);
	}
	
	//Creating a class method to display total number of products
	static void displayTotalProducts() {
		System.out.println("Total number of product is => " + totalProducts);
	}
	
	public static void main(String[] args) {
		//Creating object of product class
		Product product1 = new Product("Soap" , 20);
		Product product2 = new Product("HandWash" , 100);
		Product product3 = new Product("Oil" , 300);
		Product product4 = new Product("Soap" , 200);
		Product product5 = new Product("Soap" , 200);
		
		//Displaying details
		product1.displayProductDetails();
		product2.displayProductDetails();
		product3.displayProductDetails();
		product4.displayProductDetails();
		product5.displayProductDetails();
		
		//Displaying total number of product
		Product.displayTotalProducts();
		
		
	}
}
