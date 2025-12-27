package com.constructorandinstance.level1;

public class Vehicle {
	
	//Declaring Instance Variable
	String ownerName;
	String vehicleType;
	// Initializing class variable
	static int registrationFee   = 500;
	
	//Parameterized constructor
	Vehicle(String ownerName, String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	
	//Creating a instance method to display details
	void displayVehicleDetails() {
		System.out.println("Owner Name => " + ownerName);
		System.out.println("Vehicle Type => " + vehicleType);
		System.out.println("Registration Fees => " + registrationFee);
	}
	
	//Creating a class method to update the registration fees
	static void updateRegistrationFee() {
		registrationFee = 800;
	}
	
	public static void main(String[] args) {
		//Creating object of product class
		Vehicle vehicle1 = new Vehicle("Aman","Bike");
		Vehicle vehicle2 = new Vehicle("Rohan","Car");
		Vehicle vehicle3 = new Vehicle("Sagir","Bike");
		Vehicle vehicle4 = new Vehicle("Arpit","Scoote");
		
		
		//Displaying details
		vehicle1.displayVehicleDetails();
		vehicle2.displayVehicleDetails();
		//Update registration fees
		Vehicle.updateRegistrationFee();
		vehicle3.displayVehicleDetails();
		vehicle4.displayVehicleDetails();

		
	
		
		
	}
}

