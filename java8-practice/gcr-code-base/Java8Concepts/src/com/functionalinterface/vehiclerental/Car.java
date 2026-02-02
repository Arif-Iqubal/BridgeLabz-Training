package com.functionalinterface.vehiclerental;

//Car implementation
public class Car implements Vehicle {

	@Override
	public void rent() {
		System.out.println("Car rented");
	}

	@Override
	public void returnVehicle() {
		System.out.println("Car returned");
	}
}
