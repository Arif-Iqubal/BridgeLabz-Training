package com.functionalinterface.cloningprototype;

//Main class to test cloning
public class PrototypeApp {

	public static void main(String[] args) {

		try {
			Product originalProduct = new Product("Laptop", 55000);
			Product clonedProduct = (Product) originalProduct.clone();

			System.out.println("Original: " + originalProduct);
			System.out.println("Cloned  : " + clonedProduct);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
