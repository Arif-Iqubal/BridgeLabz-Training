package com.functionalinterface.temperaturealert;

import java.util.function.Predicate;

public class TemperatureAlert {

	public static void main(String[] args) {

		double currentTemperature = 39.5; // current temperature reading
		double threshold = 37.0; // alert threshold

		// Predicate to check if temperature crosses threshold
		Predicate<Double> isHighTemperature = temp -> temp > threshold;

		// Applying predicate
		if (isHighTemperature.test(currentTemperature)) {
			System.out.println("Alert: Temperature crossed threshold!");
		} else {
			System.out.println("Temperature is normal.");
		}
	}
}
