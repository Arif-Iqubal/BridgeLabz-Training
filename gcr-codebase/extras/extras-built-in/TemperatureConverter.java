//program to compute the compute the lcm and hcf of the given two number
import java.util.Scanner;
public class TemperatureConverter{
	//Method to take input
	public static int[] takeInput(){
		Scanner input = new Scanner(System.in);
		int[] number = new int[2];
		System.out.println("Enter temperature in celsius");
		number[0] = input.nextInt();
		System.out.println("Enter temperature in fahrenheit");
		number[1] = input.nextInt();
		
		
		input.close();
		
		return number;
		
	}
	//Method to convert fahrenheit to celsius
	public static double convertFahrenheitToCelsius(int fahrenheit){
		double fahrenheit2Celsius = (fahrenheit - 32) * (5.0/9.0);
		return fahrenheit2Celsius;
		
	}
	
	//Method to convert celsius to fahrenheit
	public static double convertCelsiusToFahrenheit(int celsius){
		double celsius2Fahrenheit = (celsius * (9.0/5.0)) + 32;
		return celsius2Fahrenheit;
		
	}
	

	public static void main(String[] args){
		
		//Method to take input and convert temperature
		int[] temperature=TemperatureConverter.takeInput();
		
		//Converting fahrenheit to celsius
		double fahrenheit = TemperatureConverter.convertCelsiusToFahrenheit(temperature[0]);
		//Converting  celsius to fahrenheit
		double celsius = TemperatureConverter.convertFahrenheitToCelsius(temperature[1]);
		
		//Displaying the converted temperature
		System.out.println("The celsius " + temperature[0] + " is equal to " + fahrenheit + " fahrenheit ");
		System.out.println("The fahrenheit " + temperature[1] + " is equal to " + celsius + " celsius ");

		
	}
}