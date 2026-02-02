package com.lambdaexpressions.nameuppercasting;

import java.util.*;
import java.util.stream.Collectors;

public class NameUppercasing {

	public static void main(String[] args) {

		// List of employee names
		List<String> employeeNames = Arrays.asList("Arif", "Rahul", "Sneha", "Kiran");

		// Converting names to uppercase using method reference
		List<String> upperCaseNames = employeeNames.stream().map(String::toUpperCase).collect(Collectors.toList());

		// Printing uppercase names
		upperCaseNames.forEach(System.out::println);
	}
}
