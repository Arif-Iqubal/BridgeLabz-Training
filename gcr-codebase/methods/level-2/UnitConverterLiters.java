//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name UnitConverterLiters to convert units

public class UnitConverterLiters {

    //Method to convert Fahrenheit to Celsius and return the value
    public static double convertfarhenheitToCelsius(double farhenheit) {
        // convert Fahrenheit to Celsius 
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;

        // return the value
        return farhenheit2celsius;
    }
	
	
	//Method to convert Celsius to Fahrenheit and return the value
    public static double convertcelsiusToFahrenheit(double celsius) {
        // convert Celsius to Fahrenheit
        double celsius2farhenheit = (celsius * 9 / 5) + 32;


        // return the value
        return celsius2farhenheit;
    }
	
	
	//Method to convert pounds to kilograms and return the value
    public static double convertpoundsToKilograms(double pounds) {
        // convert pounds to kilograms 
		double pounds2kilograms = 0.453592;
		double kilograms = pounds * pounds2kilograms;


        // return the value
        return kilograms;
    }
	
	
	//Method to convert kilograms to pounds and return the value
    public static double convertkilogramsToPounds(double kilograms) {
        // convert kilograms to pounds
        double kilograms2pounds = 2.20462;
		double pounds = kilograms * kilograms2pounds;

        // return the value
        return pounds;
    } 


	//Method to convert gallons to liters and return the value
    public static double convertgallonsToLiters(double gallons) {
        // convert gallons to liters
        double gallons2liters = 3.78541;
		double liters = gallons * gallons2liters;

        // return the value
        return liters;
    }
	
	
	 //Method to convert liters to gallons and return the value 
    public static double convertlitersToGallons(double liters) {
        // convert liters to gallons
        double liters2gallons = 0.264172; 
		double gallons = liters * liters2gallons;

        // return the value
        return gallons;
    }
	
	
	
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for km,miles,feet and meter
        System.out.print("Enter the temperature in fahrenheit: ");
        double fahrenheit = sc.nextDouble();
		System.out.print("Enter the temperature in celsius: ");
        double celsius = sc.nextDouble();
		System.out.print("Enter the weight in pounds: ");
        double pounds = sc.nextDouble();
		System.out.print("Enter the weight in kilograms: ");
        double kilograms = sc.nextDouble();
		System.out.print("Enter the qty in liters: ");
        double liters = sc.nextDouble();
		System.out.print("Enter the qty in gallons: ");
        double gallons = sc.nextDouble();

        // Call the method to convert units
        double cels = UnitConverterLiters.convertfarhenheitToCelsius( fahrenheit); 
		double fahr = UnitConverterLiters.convertcelsiusToFahrenheit( celsius); 
		double kg = UnitConverterLiters.convertpoundsToKilograms( pounds); 
		double pou = UnitConverterLiters.convertkilogramsToPounds( kilograms); 
		double lt = UnitConverterLiters.convertgallonsToLiters( gallons); 
		double gl = UnitConverterLiters.convertlitersToGallons( liters);

        // Display values
        System.out.println("convert Fahrenheit to Celsius : " + cels);
		System.out.println("convert Celsius to Fahrenheit : " + fahr);
		System.out.println("convert pounds to kilograms : " + kg);
		System.out.println("convert kilograms to pounds : " + pou);
		System.out.println("convert gallons to liters : " + lt);
	    System.out.println("convert liters to gallons : " + gl);


		

        // Close the Scanner object
        sc.close();
    }
}
