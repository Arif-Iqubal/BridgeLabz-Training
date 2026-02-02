package com.lambdaexpressions.notificationfilter;

import java.util.*;

//Main execution class
public class HospitalNotificationApp {

	public static void main(String[] args) {

		// Hospital-generated alerts
		List<Alert> alerts = Arrays.asList(new Alert("EMERGENCY", "Heart rate critical"),
				new Alert("APPOINTMENT", "Doctor visit at 5 PM"), new Alert("MEDICATION", "Take insulin dose"),
				new Alert("BILLING", "Pending hospital bill"));

		// Applying user preference filter
		List<Alert> filteredAlerts = AlertService.filterAlerts(alerts, AlertPreference.emergencyAndMedicationOnly());

		// Displaying filtered alerts
		filteredAlerts.forEach(System.out::println);
	}
}
