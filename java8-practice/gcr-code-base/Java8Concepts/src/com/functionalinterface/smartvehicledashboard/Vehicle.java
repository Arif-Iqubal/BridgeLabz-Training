package com.functionalinterface.smartvehicledashboard;

//Common interface for all vehicles
public interface Vehicle {

	void displaySpeed(); // mandatory for all vehicles

	// Default method for battery display (optional for vehicles)
	default void displayBattery() {
		System.out.println("Battery information not available");
	}
}
