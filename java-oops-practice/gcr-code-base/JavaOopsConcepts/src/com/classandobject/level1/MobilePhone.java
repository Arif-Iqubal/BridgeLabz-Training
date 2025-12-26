package com.classandobject.level1;

public class MobilePhone {
	//Declaring variable for entering the details
	String brand;
	String model;
	double price;
	
	//constructor
	MobilePhone(String brand,String model,double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	//Method to display the details of mobile
	public void diplayMobile() {
		System.out.println("Brand of mobile: "+brand);
		System.out.println("Model of mobile: "+model);
		System.out.println("Price of mobile: "+price);
		System.out.println("------------------------------");
	}
	public static void main(String[] args) {
	//Creating object of MobilePhone class
	MobilePhone mobile1=new MobilePhone("VIVO","VIVO V29" , 15999);
	MobilePhone mobile2=new MobilePhone("ONE PLUS","ONE PLUS nord4",39999);
	MobilePhone mobile3=new MobilePhone("APPLE","iphone pro16",79999);
	
	//Calling method to display the details of object
	mobile1.diplayMobile();
	mobile2.diplayMobile();
	mobile3.diplayMobile();
	}
}
