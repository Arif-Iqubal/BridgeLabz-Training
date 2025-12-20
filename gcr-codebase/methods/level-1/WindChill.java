 //importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name WindChill and compute the wind chill
public class WindChill{
	
	
	// computing the wind chill
	public static double calculateWindChill(double temperature, double windSpeed) {
		
		double windChill= 35.74 + (0.6215 *temperature) + ((0.4275*temperature) - 35.75) * Math.pow( windSpeed,0.16 );
		return windChill;
	}

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input
	System.out.println("Enter the temperature : ");
	double temperature = input.nextDouble();
	System.out.println("Enter wind speed : ");
	double windSpeed = input.nextDouble();
	
	

	
	//Calling the FindWindChill method to compute the wind chill
	
	double result = WindChill.calculateWindChill(temperature, windSpeed);
	
	//displaying the wind chill
	System.out.println("The wind chill is  " + result);
	

	//close the Scanner object
	input.close();
	
	
	
	}




} 