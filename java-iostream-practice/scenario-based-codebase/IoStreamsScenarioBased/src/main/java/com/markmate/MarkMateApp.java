package com.markmate;

import java.io.InputStream;
import java.util.List;

public class MarkMateApp {

	public static void main(String[] args) {

		// Read CSV from resources
		InputStream is = MarkMateApp.class.getClassLoader().getResourceAsStream("docs/csv/marks.csv");

		if (is == null) {
			throw new RuntimeException("CSV file not found");
		}

		List<Student> students = CSVProcessor.processCSV(is);

		// Write JSON outside resources
		String jsonFile = System.getProperty("user.dir") + "/output/reportCard.json";

		JSONExporter.exportToJson(students, jsonFile);

		System.out.println("Report card generated successfully");
	}
}
