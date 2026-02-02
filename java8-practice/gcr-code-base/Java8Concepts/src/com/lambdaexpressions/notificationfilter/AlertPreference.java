package com.lambdaexpressions.notificationfilter;

import java.util.function.Predicate;

//User preference logic using Predicate
public class AlertPreference {

	public static Predicate<Alert> emergencyAndMedicationOnly() {
		return alert -> alert.getType().equals("EMERGENCY") || alert.getType().equals("MEDICATION");
	}
}
