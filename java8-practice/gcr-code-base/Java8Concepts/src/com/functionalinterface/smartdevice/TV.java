package com.functionalinterface.smartdevice;

//TV device implementation
public class TV implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("TV turned ON");
	}

	@Override
	public void turnOff() {
		System.out.println("TV turned OFF");
	}
}
