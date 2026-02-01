package com.markmate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class JSONExporter {

	public static void exportToJson(List<Student> students, String filePath) {

		try {
			File file = new File(filePath);

			// create parent directories if missing
			file.getParentFile().mkdirs();

			Gson gson = new GsonBuilder().setPrettyPrinting().create();

			try (FileWriter writer = new FileWriter(file)) {
				gson.toJson(students, writer);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
