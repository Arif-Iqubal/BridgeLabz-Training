package com.functionalinterface.smartdevice;

//Light device implementation
public class Light implements SmartDevice {

	@Override
	public void turnOn() {
		System.out.println("Light turned ON");
	}

	@Override
	public void turnOff() {
		System.out.println("Light turned OFF");
	}
}
