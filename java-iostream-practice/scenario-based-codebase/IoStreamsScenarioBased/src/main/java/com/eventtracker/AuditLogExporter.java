package com.eventtracker;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class AuditLogExporter {

	public static void exportLogs(List<AuditLog> logs, String filePath) {

		try {
			File file = new File(filePath);
			file.getParentFile().mkdirs();

			Gson gson = new GsonBuilder().registerTypeAdapter(java.time.LocalDateTime.class, new LocalDateTimeAdapter())
					.setPrettyPrinting().create();

			try (FileWriter writer = new FileWriter(file)) {
				gson.toJson(logs, writer);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
