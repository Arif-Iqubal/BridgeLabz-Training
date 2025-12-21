//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name UnitConverterYards to convert distance units

public class UnitConverterYards {

    // Method To convert yards to feet and return the value
    public static double convertYardsToFeet(double yards) {
        // Convert yards to feet
        double yards2feet = 3;
        double feet = yards * yards2feet;

        // return the value
        return feet;
    }
	
	 // Method To convert feet to yard and return the value
    public static double convertfeetToYard(double feet) {
        // Convert feet to yard
        double feet2yards = 0.333333;
        double km = feet * feet2yards;

        // return the value
        return km;
    }
	
	 // Method To convert meters to inches and return the value
    public static double convertmetersToInches(double meters) {
        // Convert meters to inches
        double meters2inches = 39.3701;
        double inches = meters * meters2inches;

        // return the value
        return inches;
    }
	
	 // Method To convert inches to cm and return the value
    public static double convertinchesToCm(double inches) {
        // Convert inches to cm
		double inches2cm = 2.54;
        double cm = inches * inches2cm;

        // return the value
        return cm;
    }
	
	 // Method To convert inches to meters and return the value
    public static double convertfeetToMeters(double inches) {
        // Convert inches to meter
        double inches2meters = 0.0254;
        double meters = inches * inches2meters;

        // return the value
        return meters;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for km,miles,feet and meter
        System.out.print("Enter the distance in yard: ");
        double yard = sc.nextDouble();
		System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();
		System.out.print("Enter the distance in meters: ");
        double meters = sc.nextDouble();
		System.out.print("Enter the distance in inches: ");
        double inches = sc.nextDouble();

        // Call the method to convert units
        double feetConverted = UnitConverterYards.convertYardsToFeet(yard); 
		double yardsCoverted = UnitConverterYards.convertfeetToYard(feet); 
		double inchesConverted = UnitConverterYards.convertmetersToInches(meters); 
		double metersConverted = UnitConverterYards.convertfeetToMeters(inches); 
		double cmConverted = UnitConverterYards.convertinchesToCm(inches); 

        // Display value in miles
        System.out.println("Distance in yards to feet : " + feetConverted);
		System.out.println("Distance in feet to yard : " + yardsCoverted);
        System.out.println("Distance in meters to inches : " + inchesConverted);
        System.out.println("Distance in inches to meter : " + metersConverted);
        System.out.println("Distance in inches to cm : " + cmConverted);

		

        // Close the Scanner object
        sc.close();
    }
}
