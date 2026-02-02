package com.functionalinterface.paymentgateway;

//UPI payment implementation
public class UPIPayment implements PaymentProcessor {

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using UPI");
	}
}
