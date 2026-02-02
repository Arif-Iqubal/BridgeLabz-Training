package com.functionalinterface.smartvehicledashboard;

//Electric vehicle implementation
public class ElectricCar implements Vehicle {

	@Override
	public void displaySpeed() {
		System.out.println("Speed: 90 km/h");
	}

	// Overriding default battery display
	@Override
	public void displayBattery() {
		System.out.println("Battery: 75%");
	}
}
