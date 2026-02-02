package com.functionalinterface.dataexport;

//Interface for data export functionality
public interface DataExporter {

	void export(); // existing export method

	// Default JSON export to avoid breaking old implementations
	default void exportToJSON() {
		System.out.println("Exporting data in JSON format (default implementation)");
	}
}
