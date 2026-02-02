package com.lambdaexpressions.invoicecreation;

import java.util.*;

//Main execution class
public class InvoiceApp {

	public static void main(String[] args) {

		// Transaction IDs
		List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003");

		// Generating invoice objects
		List<Invoice> invoices = InvoiceService.createInvoices(transactionIds);

		// Printing invoices
		invoices.forEach(System.out::println);
	}
}
