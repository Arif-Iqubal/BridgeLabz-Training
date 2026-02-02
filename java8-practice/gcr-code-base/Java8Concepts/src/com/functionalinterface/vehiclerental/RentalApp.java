package com.functionalinterface.vehiclerental;

//Main class to test rental system
public class RentalApp {

	public static void main(String[] args) {

		Vehicle car = new Car(); // vehicle reference to car
		Vehicle bike = new Bike(); // vehicle reference to bike
		Vehicle bus = new Bus(); // vehicle reference to bus

		car.rent();
		bike.rent();
		bus.rent();

		car.returnVehicle();
		bike.returnVehicle();
		bus.returnVehicle();
	}
}
