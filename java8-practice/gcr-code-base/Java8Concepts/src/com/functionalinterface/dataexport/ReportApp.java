package com.functionalinterface.dataexport;

//Main class to test data export feature
public class ReportApp {

	public static void main(String[] args) {

		DataExporter csv = new CSVExporter();
		DataExporter pdf = new PDFExporter();

		csv.export();
		csv.exportToJSON(); // default method

		pdf.export();
		pdf.exportToJSON(); // default method
	}
}
