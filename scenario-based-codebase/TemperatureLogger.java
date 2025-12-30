//Program to compute average and maximum temperature in a week
//importing Scanner class from java.util package
import java.util.Scanner;

public class TemperatureLogger{
	//Method to compute average of temperature in a year
	public static double averageTemperature(int[] temperature){
		int length = temperature.length;
		double average = 0;
		int sum = 0;
		for(int i=0;i<length;i++){
			sum += temperature[i];
		}
		average = sum / length;
		return average;
	}

	//Method to compute maximum temperature
	public static int maxTemperature(int[] temperature){
		int length = temperature.length;
		int maximumTemperature = temperature[0];
		
		for(int i=1;i<length;i++){
			if(maximumTemperature < temperature[i]){
				maximumTemperature = temperature[i];
			}
		}
		
		return maximumTemperature;
	}
	
	//Method to display temperature
	public static void displayTemperature(String[] week,int[] temperature){
		System.out.println("Last week temperature overview");
		System.out.println("-----------------------------------------");
		System.out.println("Days\t\t\tTemperature");
		for(int i =0; i<7;i++){
			System.out.println(week[i]+"\t\t"+temperature[i] + " C");
		}
	}
	
	
	public static void main(String[] args){
		//Creating object of Scanner class
		Scanner input = new Scanner(System.in);
		
		//Initializing days in a week
		String[] week = {"Sunday   ","Monday   ","Tuesday   ","Wednesday","Thrusday","Friday   ","Saturday"};
		
		//Taking user input for temperature
		int [] temperature = new int[7];
		for(int i =0; i<7;i++){
			System.out.println("Enter temperature of " + week[i] + " in Celcius");
			temperature[i] = input.nextInt();
		
		}
		
		//Calling methods to compute average and max temperature
		double average = TemperatureLogger.averageTemperature(temperature);
		int maximum = TemperatureLogger.maxTemperature(temperature);
		
		//Displaying result
		System.out.println("-----------------------------------------");
		TemperatureLogger.displayTemperature(week,temperature);
		System.out.println("-----------------------------------------");
		System.out.println("Maximum temperature in this week is "+ maximum + " C");
		System.out.println("-----------------------------------------");
		System.out.println("Average temperature in this week is "+ average + " C");
		System.out.println("-----------------------------------------");
		
		
		
		input.close();
	}
}