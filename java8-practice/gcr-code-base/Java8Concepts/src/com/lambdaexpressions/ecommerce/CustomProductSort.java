package com.lambdaexpressions.ecommerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomProductSort {
	
	//Method to display item from the list
	public static void displayProduct(List<Product> productList) {
		System.out.println("------------------------------------------------------------");
		System.out.println("Product\t\t\tPrice\t\tRating\tDiscount");
		System.out.println("------------------------------------------------------------");
		for(Product l:productList) {
			System.out.println(l.name + "\t" +l.price + "\t\t" +l.rating+ "\t" + l.discount );
		}
		System.out.println("------------------------------------------------------------");
	}

	//Main method
	public static void main(String[] args) {
		
		//Product list to store product
		List<Product> productList = new ArrayList<>();
		
		//Creating object of Product
		Product item1  = new Product("Laptop		",        65000.00, 4.5, 10.0);
		Product item2  = new Product("Smartphone	",    28000.00, 4.3, 12.5);
		Product item3  = new Product("Headphones	",     3500.00, 4.2, 15.0);
		Product item4  = new Product("Smartwatch	",    12000.00, 4.1,  8.0);
		Product item5  = new Product("Bluetooth Speaker", 4500.00, 4.4, 20.0);
		Product item6  = new Product("Keyboard		",       1500.00, 4.0,  5.0);
		Product item7  = new Product("Mouse		",           900.00, 4.3,  7.5);
		Product item8  = new Product("Monitor		",       18000.00, 4.6, 10.0);
		Product item9  = new Product("External HDD	",   5500.00, 4.2, 18.0);
		Product item10 = new Product("Power Bank	",     2200.00, 4.1, 12.0);
		
		//Adding product to list
		productList.add(item1);
		productList.add(item2);
		productList.add(item3);
		productList.add(item4);
		productList.add(item5);
		productList.add(item6);
		productList.add(item7);
		productList.add(item8);
		productList.add(item9);
		productList.add(item10);
		
		//Creating a comparator to do custom sort
		Comparator<Product> comparator = Comparator.comparing(Product::getRating).reversed().thenComparing(Product::getDiscount);
		System.out.println("Displaying product details before sorting");
		displayProduct(productList); //Displaying product list
		
		//Displaying product list after sorting based on price
		System.out.println("\n\n ------------- Sorting based on Price ------------------");
		Collections.sort(productList, (a,b) -> (int)(a.price-b.price));
		displayProduct(productList);

		//Displaying product list after sorting based on rating
		System.out.println("\n\n ------------- Sorting based on Rating ------------------");
		productList.sort(comparator);
		displayProduct(productList);
		
		//Displaying product list after sorting based on discount
		System.out.println("\n\n ------------- Sorting based on Discount ------------------");
		Collections.sort(productList, (a,b) -> {
			if((a.discount-b.discount)>0){
			return -1;
			}
			else if((a.discount-b.discount)<0){
				return 1;
			}
			else return 0;
		});
		displayProduct(productList);
	}

}
