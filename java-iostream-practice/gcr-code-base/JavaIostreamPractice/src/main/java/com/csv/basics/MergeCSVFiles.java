package com.csv.basics;

import java.io.BufferedReader; // For reading CSV files
import java.io.BufferedWriter; // For writing CSV files
import java.io.InputStreamReader; // Converts byte stream to char stream
import java.io.FileWriter; // Writes data to file
import java.io.File; // Represents file path
import java.io.IOException; // Handles IO exceptions
import java.util.HashMap; // Stores CSV data by ID
import java.util.Map; // Map interface

public class MergeCSVFiles {

	public static void main(String[] args) {

		// Map to store ID → Name,Age
		Map<String, String> studentDetails = new HashMap<>();

		String outputDir = "output";
		String outputFile = outputDir + "/merged_students.csv";

		// Create output directory if it does not exist
		File dir = new File(outputDir);
		if (!dir.exists()) {
			dir.mkdir();
		}

		// STEP 1: Read students1.csv
		try (BufferedReader br1 = new BufferedReader(new InputStreamReader(
				MergeCSVFiles.class.getClassLoader().getResourceAsStream("docs/csv/students1.csv")))) {

			String line;
			boolean isHeader = true;

			while ((line = br1.readLine()) != null) {

				// Skip header row
				if (isHeader) {
					isHeader = false;
					continue;
				}

				String[] data = line.split(",");

				String id = data[0]; // Student ID
				String nameAge = data[1] + "," + data[2]; // Name,Age

				// Store data in map
				studentDetails.put(id, nameAge);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// STEP 2: Read students2.csv and merge data
		try (BufferedReader br2 = new BufferedReader(new InputStreamReader(
				MergeCSVFiles.class.getClassLoader().getResourceAsStream("docs/csv/students2.csv")));
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

			// Write header for merged CSV
			bw.write("ID,Name,Age,Marks,Grade");
			bw.newLine();

			String line;
			boolean isHeader = true;

			while ((line = br2.readLine()) != null) {

				// Skip header row
				if (isHeader) {
					isHeader = false;
					continue;
				}

				String[] data = line.split(",");

				String id = data[0]; // Student ID
				String marks = data[1]; // Marks
				String grade = data[2]; // Grade

				// Merge data if ID exists in first CSV
				if (studentDetails.containsKey(id)) {

					bw.write(id + "," + studentDetails.get(id) + "," + marks + "," + grade);
					bw.newLine();
				}
			}

			System.out.println("CSV files merged successfully!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
