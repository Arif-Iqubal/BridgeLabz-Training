package com.functionalinterface.paymentgateway;

//Payment processor interface with default refund support
public interface PaymentProcessor {

	void pay(double amount); // existing method

	// Default refund method to avoid breaking existing implementations
	default void refund(double amount) {
		System.out.println("Refund of ₹" + amount + " initiated (default process)");
	}
}
