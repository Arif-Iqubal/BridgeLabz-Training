package com.functionalinterface.unitconversion;

//Interface containing unit conversion utilities
public interface UnitConverter {

	// Convert kilometers to miles
	static double kmToMiles(double km) {
		return km * 0.621371;
	}

	// Convert kilograms to pounds
	static double kgToLbs(double kg) {
		return kg * 2.20462;
	}
}
