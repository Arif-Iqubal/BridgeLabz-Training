package com.lambdaexpressions.invoicecreation;

import java.util.List;
import java.util.stream.Collectors;

// Service class for invoice creation
public class InvoiceService {

	// Creating invoices using constructor reference
	public static List<Invoice> createInvoices(List<String> transactionIds) {
		return transactionIds.stream().map(Invoice::new) // constructor reference
				.collect(Collectors.toList());
	}
}
