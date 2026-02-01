package com.eventtracker;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EventTrackerScanner {

	public static List<AuditLog> scanClass(Class<?> clazz) {

		List<AuditLog> logs = new ArrayList<>();

		for (Method method : clazz.getDeclaredMethods()) {

			if (method.isAnnotationPresent(AuditTrail.class)) {

				AuditTrail audit = method.getAnnotation(AuditTrail.class);

				logs.add(new AuditLog(clazz.getSimpleName(), method.getName(), audit.action(), audit.description(),
						LocalDateTime.now()));
			}
		}
		return logs;
	}
}
