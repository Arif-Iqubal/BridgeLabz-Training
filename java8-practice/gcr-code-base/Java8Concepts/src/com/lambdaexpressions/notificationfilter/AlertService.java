package com.lambdaexpressions.notificationfilter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

// Service class to filter alerts
public class AlertService {

	public static List<Alert> filterAlerts(List<Alert> alerts, Predicate<Alert> preference) {
		return alerts.stream().filter(preference).collect(Collectors.toList());
	}
}
