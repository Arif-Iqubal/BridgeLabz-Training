package com.constructorandinstance.level1;

public class CarRental {
	// Declaring class attributes customerName, carModel, and rentalDays
	String customerName;
	String carModel;
	int rentalDays;
	int priceOneDay=500;
	
	//Parameterized constructor
	CarRental(	String customerName,String carModel,int rentalDays){
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
	}
	//Method to compute and display rental fair
	void computeRent() {
		System.out.println("Customer Name => " + customerName);
		System.out.println("Car Model => " + carModel);
		System.out.println("Rental Days=> " + rentalDays);
		System.out.println("Total fair => " + (priceOneDay*rentalDays));
	}
	public static void main(String[] args) {
		// Creating object of CarRental class
		CarRental car1 = new CarRental("Rohan","Tata Nano",4);
		CarRental car2 = new CarRental("Amit","Bularo",2);
		CarRental car3 = new CarRental("Roshan","Thar",5);
		CarRental car4 = new CarRental("Karan","Alto",1);
		
		//CAlling method to compute and display rental fair
		car1.computeRent();
		car2.computeRent();
		car3.computeRent();
		car4.computeRent();

	}

}
