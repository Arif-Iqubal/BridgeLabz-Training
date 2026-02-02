package com.functionalinterface.smartvehicledashboard;

//Petrol vehicle implementation
public class PetrolCar implements Vehicle {

	@Override
	public void displaySpeed() {
		System.out.println("Speed: 80 km/h");
	}
}
