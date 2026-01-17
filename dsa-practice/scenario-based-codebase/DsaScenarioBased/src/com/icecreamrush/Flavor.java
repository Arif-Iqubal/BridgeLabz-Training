package com.icecreamrush;

//Class Flavor to store ice cream flavor details
public class Flavor {

	// Instance of class
	String flavorName;
	int soldCount = 0;

	// Parameterized constructor
	public Flavor(String flavorName) {

		this.flavorName = flavorName;

	}

	// Method to increase Sold count
	void soldIceCream() {
		System.out.println(flavorName + " Sold");
		this.soldCount++;
	}

}
