package com.functionalinterface.dataexport;

//CSV export implementation
public class CSVExporter implements DataExporter {

	@Override
	public void export() {
		System.out.println("Exporting data to CSV");
	}
}
