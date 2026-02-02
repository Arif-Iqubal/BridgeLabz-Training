package com.stream.transformingnames;

import java.util.*;

//Main class
public class CustomerApp {

	public static void main(String[] args) {

		List<Customer> customers = Arrays.asList(new Customer("arif"), new Customer("sneha"), new Customer("rahul"),
				new Customer("kiran"));

		// Transform and display customer names
		List<String> displayNames = CustomerService.getFormattedNames(customers);

		displayNames.forEach(System.out::println);
	}
}
