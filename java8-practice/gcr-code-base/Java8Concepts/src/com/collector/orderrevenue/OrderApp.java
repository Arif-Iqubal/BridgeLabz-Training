package com.collector.orderrevenue;

import java.util.*;

//Main class
public class OrderApp {

	public static void main(String[] args) {

		List<Order> orders = Arrays.asList(new Order("Arif", 2500), new Order("Arif", 1800), new Order("Sneha", 3200),
				new Order("Rahul", 1500), new Order("Sneha", 700));

		// Revenue summary per customer
		Map<String, Double> revenueSummary = OrderService.getRevenueByCustomer(orders);

		// Display result
		revenueSummary.forEach((customer, total) -> System.out.println(customer + " Total Revenue: ₹" + total));
	}
}
