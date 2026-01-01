package com.inheritance.singlelevel.smarthomedevice;
//Main class 
public class DeviceMain {

	public static void main(String[] args) {
		
		//Creating object of Thermostat class
		Device device1 = new Thermostat("123","On","Medium");
		
		//Displaying status
		System.out.println("-----------------------");
		device1.displayStatus();
		System.out.println("-----------------------");

	}

}
