//importing Scanner class from java.util package
import java.util.Scanner;



//Creating a class name DistanceConversion to convert distance from feets to yard and miles

public class DistanceConversion{

	public static void main(String[] args){
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Displaying message to user, to input distance in feets
	System.out.println("Enter the distance in feets : ");
	
	// Creating a variable double and storing the user input distance in kilometer
	int distance = input.nextInt();
	
	// Converting feet to Miles
	double miles = distance * 0.000189394 ;
	
	
	// Converting feet to yard
	double yard = distance * 0.333333 ;
	
	// Display the distance in miles
	System.out.println("The total miles and yard is " + miles + " mile and " + yard + " yard for the given " + distance + " feet " );
	
	//close the Scanner object
	input.close();
	
	
	}




} 