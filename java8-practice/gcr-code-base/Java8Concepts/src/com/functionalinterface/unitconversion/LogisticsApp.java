package com.functionalinterface.unitconversion;

//Main class to test unit conversions
public class LogisticsApp {

	public static void main(String[] args) {

		double distanceKm = 100; // distance in kilometers
		double weightKg = 50; // weight in kilograms

		// Using static interface methods
		System.out.println("Miles: " + UnitConverter.kmToMiles(distanceKm));
		System.out.println("Pounds: " + UnitConverter.kgToLbs(weightKg));
	}
}
