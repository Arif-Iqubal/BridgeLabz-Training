package com.inheritance.basic.vehicletransport;

//Main class that display the details of different vehicle
public class VehicleMain {
	public static void main(String[] args) {
		
		//Creating object of different vehicle class
		Vehicle vehicle1 = new Car(200,"Petrol",6);
		Vehicle vehicle2 = new Truck(100,"Diesel",12);
		Vehicle vehicle3 = new MotorCycle(120,"Petrol","Yes");
		
		//Displaying info of different vehicle
		System.out.println("---------------------");
		vehicle1.displayInfo();
		System.out.println("---------------------");
		vehicle2.displayInfo();
		System.out.println("---------------------");
		vehicle3.displayInfo();
		System.out.println("---------------------");
	}
}
