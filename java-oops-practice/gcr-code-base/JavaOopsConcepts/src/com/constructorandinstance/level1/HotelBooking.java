package com.constructorandinstance.level1;

public class HotelBooking {
	//guestName, roomType, and nights.
	String guestName;
	String roomType;
	int nights;
	
	//Default constructor
	HotelBooking(){
		System.out.println("Default constructor called");
		
	}
	//Parameterized constructor
	HotelBooking(String guestName,String roomType,int nights){
		System.out.println("Parameterized constructor called");
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	//Copy constructor
	HotelBooking(HotelBooking person){
		System.out.println("Copy constructor called");
		this.guestName = person.guestName;
		this.roomType = person.roomType;
		this.nights = person.nights;
	}
	
	//Method to display the hotel booking details
	void display(){
		System.out.println("Guest Name => " + this.guestName);
		System.out.println("Room Type => " + this.roomType);
		System.out.println("Nights => " + this.nights);
	}
	public static void main(String[] args) {
	
		//Creating object of HotelBooking class using default constructor
		HotelBooking guest1 = new HotelBooking();
		guest1.guestName = "Rinu";
		guest1.roomType = "Single bed";
		guest1.nights = 3;
		
		//Creating object of HotelBooking class using parameterized constructor
		HotelBooking guest2 = new HotelBooking("Mona","Double bed",4);
		HotelBooking guest3 = new HotelBooking("Sohan","Double bed",1);
		
		//Creating object of HotelBooking class using copy constructor
		HotelBooking guest4 = new HotelBooking(guest2);
		
		//Displaying details of hotel bookings
		guest1.display();
		guest2.display();
		guest3.display();
		guest4.display();
		
		
		

	}

}
