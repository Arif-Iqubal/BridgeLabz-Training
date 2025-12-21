//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name UnitConverter to convert distance units

public class UnitConverter {

    // Method To convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) {
        // Convert km to miles
        double km2miles = 0.621371;
        double miles = km * km2miles;

        // return the value
        return miles;
    }
	
	 // Method To convert miles to kilometers and return the value
    public static double convertmilesToKm(double miles) {
        // Convert miles to km
        double miles2km = 1.60934;
        double km = miles * miles2km;

        // return the value
        return km;
    }
	
	 // Method To convert meters to feet and return the value
    public static double convertmetersToFeet(double meters) {
        // Convert meters to feet
        double meters2feet = 3.28084;
        double feet = meters * meters2feet;

        // return the value
        return feet;
    }
	
	 // Method To convert feet to meters and return the value
    public static double convertfeetToMeters(double feet) {
        // Convert feet to meters
        double feet2meters = 0.3048;
        double meters = feet * feet2meters;

        // return the value
        return meters;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for km,miles,feet and meter
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();
		System.out.print("Enter the distance in miles: ");
        double miles = sc.nextDouble();
		System.out.print("Enter the distance in meters: ");
        double meters = sc.nextDouble();
		System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();

        // Call the method to convert units
        double milesConverted = UnitConverter.convertKmToMiles(km); 
		double kmCoverted = UnitConverter.convertmilesToKm(miles); 
		double meterConverted = UnitConverter.convertmetersToFeet(meters); 
		double feetConverted = UnitConverter.convertfeetToMeters(feet); 

        // Display value in miles
        System.out.println("Distance in km to miles : " + milesConverted);
		System.out.println("Distance in miles to km : " + kmCoverted);
        System.out.println("Distance in meters to feet : " + feetConverted);
        System.out.println("Distance in feet to meters: " + meterConverted);

		

        // Close the Scanner object
        sc.close();
    }
}
