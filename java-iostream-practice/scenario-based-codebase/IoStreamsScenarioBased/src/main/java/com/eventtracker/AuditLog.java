package com.eventtracker;

import java.time.LocalDateTime;

public class AuditLog {

	private String className;
	private String methodName;
	private String action;
	private String description;
	private LocalDateTime timestamp;

	public AuditLog(String className, String methodName, String action, String description, LocalDateTime timestamp) {

		this.className = className;
		this.methodName = methodName;
		this.action = action;
		this.description = description;
		this.timestamp = timestamp;
	}
}
