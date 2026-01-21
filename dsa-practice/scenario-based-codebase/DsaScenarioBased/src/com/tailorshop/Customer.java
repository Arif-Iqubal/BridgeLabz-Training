package com.tailorshop;

import java.time.LocalDate;

//Customer class to store customer details
public class Customer {
	String customerName;
	String clothType;
	LocalDate deliveryDate;
	int slipNumber;

	// Parameterized Constructor
	public Customer(String customerName, String clothType, LocalDate deliveryDate, int slipNumber) {

		this.customerName = customerName;
		this.clothType = clothType;
		this.deliveryDate = deliveryDate;
		this.slipNumber = slipNumber;
	}

}
