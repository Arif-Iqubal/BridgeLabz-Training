package com.functionalinterface.paymentgateway;

//Credit Card payment implementation
public class CardPayment implements PaymentProcessor {

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using Credit Card");
	}

	// Overriding default refund method
	@Override
	public void refund(double amount) {
		System.out.println("Refund of ₹" + amount + " processed to Credit Card");
	}
}
