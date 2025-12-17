//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name CentimeterToFeet and displaying the height in feet

public class CentimeterToFoot{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Displaying message to user, to enter your height in centimeters
	System.out.println("Enter your height in centimeters : ");
	
	// Creating a variable integer and storing the height of the person
	int height = input.nextInt();
	

	//Converting height from centimeters to feet
	double heightInFeet = height * 0.0328084 ;
	
	//Converting height from centimeters to inches
	double heightInInches = height * 0.393701 ;
	
	
	
	// displaying the height in centimeters, feet, and inches
	System.out.println("Your Height in cm is " + height + " while in feet is " + heightInFeet + " and inches is " + heightInInches );
	
	
	//close the Scanner object
	input.close();
	
	
	
	}




} 