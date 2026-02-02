package com.functionalinterface.lengthchecker;

import java.util.function.Function;

public class StringLengthChecker {

	public static void main(String[] args) {

		String message = "This is an important notification message";
		int limit = 20;

		// Function to calculate string length
		Function<String, Integer> lengthFunction = String::length;

		// Applying function
		int messageLength = lengthFunction.apply(message);

		if (messageLength > limit) {
			System.out.println("Message exceeds character limit");
		} else {
			System.out.println("Message is within character limit");
		}
	}
}
