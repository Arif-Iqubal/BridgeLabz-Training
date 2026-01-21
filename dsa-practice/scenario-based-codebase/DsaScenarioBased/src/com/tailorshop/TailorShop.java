package com.tailorshop;

import java.time.LocalDate;

public class TailorShop {

	static int listSize = 0; // Static variable to store size of Customer
	static Customer[] customerList = new Customer[listSize]; // Customer array to store Customer object

	// Static method to add Customer to array list
	public static void addCustomer(String customerName, String clothType, LocalDate deliveryDate, int slipNumber) {
		Customer Customer = new Customer(customerName, clothType, deliveryDate, slipNumber);
		if (listSize <= customerList.length) {
			Customer[] temp = new Customer[++listSize];
			for (int i = 0; i < listSize - 1; i++) {
				temp[i] = customerList[i];
			}
			temp[listSize - 1] = Customer;
			customerList = temp;
			System.out.println(listSize + ") Customer added successfully ");
		}

		// Applying insertion sort at real time
		int j = listSize - 2;
		while (j >= 0 && customerList[j].deliveryDate.isAfter(Customer.deliveryDate)) {

			customerList[j + 1] = customerList[j];
			j--;
		}
		customerList[j + 1] = Customer;
	}

	// Static method to display Customer details
	public static void displayInfo() {
		System.out.println("----------------------------------------------------------");
		System.out.println("-------------- Customer Details ---------------");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Customer Name\t\tCloth Type\tDelivery Date\tSlip Number");
		System.out.println("----------------------------------------------------------------------------");
		for (int i = 0; i < listSize; i++) {
			System.out.println(customerList[i].customerName + "\t\t" + customerList[i].clothType + "\t\t"
					+ customerList[i].deliveryDate + "\t" + customerList[i].slipNumber);
		}
		System.out.println("----------------------------------------------------------------------------");
	}

	// Main method
	public static void main(String[] args) {

		// Adding Customer to array list
		addCustomer("Rahul Sharma", "Shirt", LocalDate.of(2026, 2, 5), 1001);
		addCustomer("Amit Patel", "Pant", LocalDate.of(2026, 2, 7), 1002);
		addCustomer("Neha Verma", "Saree", LocalDate.of(2026, 2, 10), 1003);
		addCustomer("Priya Singh", "Kurti", LocalDate.of(2026, 2, 12), 1004);
		addCustomer("Rohan Mehta", "Blazer", LocalDate.of(2026, 2, 15), 1005);
		addCustomer("Anjali Gupta", "Lehenga", LocalDate.of(2026, 2, 18), 1006);
		addCustomer("Suresh Kumar", "Coat", LocalDate.of(2026, 2, 20), 1007);
		addCustomer("Pooja Nair", "Gown", LocalDate.of(2026, 2, 22), 1008);
		addCustomer("Vikram Joshi", "Jeans", LocalDate.of(2026, 2, 25), 1009);
		addCustomer("Sneha Das", "Top", LocalDate.of(2026, 2, 27), 1010);
		addCustomer("Arjun Malhotra", "Suit", LocalDate.of(2026, 3, 1), 1011);
		addCustomer("Kavita Rao", "Salwar", LocalDate.of(2026, 3, 3), 1012);

		// Calling method to display Customer details
		displayInfo();

	}

}
