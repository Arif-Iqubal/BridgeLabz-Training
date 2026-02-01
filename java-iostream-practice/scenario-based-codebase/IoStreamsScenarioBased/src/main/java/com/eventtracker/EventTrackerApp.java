package com.eventtracker;

import java.util.List;

public class EventTrackerApp {

	public static void main(String[] args) {

		List<AuditLog> logs = EventTrackerScanner.scanClass(UserService.class);

		String outputPath = System.getProperty("user.dir") + "/audit/event_logs.json";

		AuditLogExporter.exportLogs(logs, outputPath);

		System.out.println("Audit logs generated successfully");
	}
}
