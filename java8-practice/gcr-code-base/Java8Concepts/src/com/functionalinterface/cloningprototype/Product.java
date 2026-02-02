package com.functionalinterface.cloningprototype;

//Prototype class implementing Cloneable marker interface
public class Product implements Cloneable {

	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Overriding clone method to enable object cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); // shallow copy
	}

	@Override
	public String toString() {
		return name + " - ₹" + price;
	}
}
