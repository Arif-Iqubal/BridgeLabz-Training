package com.functionalinterface.vehiclerental;

//Bike implementation
public class Bike implements Vehicle {

	@Override
	public void rent() {
		System.out.println("Bike rented");
	}

	@Override
	public void returnVehicle() {
		System.out.println("Bike returned");
	}
}
