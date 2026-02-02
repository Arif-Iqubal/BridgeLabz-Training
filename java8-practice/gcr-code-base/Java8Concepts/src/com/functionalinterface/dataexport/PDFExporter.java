package com.functionalinterface.dataexport;

//PDF export implementation
public class PDFExporter implements DataExporter {

	@Override
	public void export() {
		System.out.println("Exporting data to PDF");
	}
}
