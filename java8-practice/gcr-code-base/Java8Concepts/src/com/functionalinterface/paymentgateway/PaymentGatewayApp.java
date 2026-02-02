package com.functionalinterface.paymentgateway;

//Main class to test payment gateway integration
public class PaymentGatewayApp {

	public static void main(String[] args) {

		PaymentProcessor upi = new UPIPayment();
		PaymentProcessor card = new CardPayment();

		upi.pay(1000);
		upi.refund(200); // uses default method

		card.pay(1500);
		card.refund(500); // uses overridden method
	}
}
