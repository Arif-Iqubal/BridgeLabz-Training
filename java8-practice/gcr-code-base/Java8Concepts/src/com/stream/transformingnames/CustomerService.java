package com.stream.transformingnames;

import java.util.*;
import java.util.stream.Collectors;

// Service class for name transformation
public class CustomerService {

	// Convert names to uppercase and sort alphabetically
	public static List<String> getFormattedNames(List<Customer> customers) {
		return customers.stream().map(Customer::getName) // extract name
				.map(String::toUpperCase) // convert to uppercase
				.sorted() // sort alphabetically
				.collect(Collectors.toList());
	}
}
