package com.csv.basics;

import java.io.BufferedReader; // For reading CSV file
import java.io.InputStreamReader; // Converts byte stream to character stream
import java.io.IOException; // Handles IO exceptions
import java.util.regex.Pattern; // Used for regex matching

public class ValidateCSVData {

	// Regex for valid email format
	private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

	// Regex for exactly 10-digit phone number
	private static final String PHONE_REGEX = "\\d{10}";

	public static void main(String[] args) {

		// Compile regex patterns
		Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
		Pattern phonePattern = Pattern.compile(PHONE_REGEX);

		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				// Load CSV file from resources folder
				ValidateCSVData.class.getClassLoader().getResourceAsStream("docs/csv/users.csv")))) {

			String line;
			boolean isHeader = true; // Flag to skip header row
			int rowNumber = 1; // Track row numbers

			// Read CSV file line by line
			while ((line = br.readLine()) != null) {

				// Skip header row
				if (isHeader) {
					isHeader = false;
					continue;
				}

				rowNumber++;

				// Split CSV row into columns
				String[] data = line.split(",");

				String email = data[2]; // Email column
				String phone = data[3]; // Phone column

				boolean isValid = true; // Validation flag

				// Validate email format
				if (!emailPattern.matcher(email).matches()) {
					System.out.println("Invalid Email at row " + rowNumber + " → " + email);
					isValid = false;
				}

				// Validate phone number format
				if (!phonePattern.matcher(phone).matches()) {
					System.out.println("Invalid Phone Number at row " + rowNumber + " → " + phone);
					isValid = false;
				}

				// Print row if it is invalid
				if (!isValid) {
					System.out.println("Invalid Row Data: " + line);
					System.out.println("----------------------------------");
				}
			}

		} catch (IOException e) {
			// Handle file reading exceptions
			e.printStackTrace();
		}
	}
}
