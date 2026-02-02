package com.functionalinterface.dateformat;

import java.time.LocalDate;

//Main class to test date formatting
public class InvoiceApp {

	public static void main(String[] args) {

		LocalDate invoiceDate = LocalDate.now(); // invoice date

		// Using static interface method for different formats
		System.out.println(DateFormatUtil.formatDate(invoiceDate, "dd-MM-yyyy"));
		System.out.println(DateFormatUtil.formatDate(invoiceDate, "MM/dd/yyyy"));
		System.out.println(DateFormatUtil.formatDate(invoiceDate, "yyyy-MM-dd"));
	}
}
