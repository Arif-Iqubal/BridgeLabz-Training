//importing Scanner class from java.util package
import java.util.Scanner;



//Creating a class name KilometersToMilesUserInput to convert distance from kilometer to miles

public class KilometersToMilesUserInput{

	public static void main(String[] args){
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Displaying message to user, to input distance in kilometers
	System.out.println("Enter the distance in kilometers : ");
	
	// Creating a variable double and storing the user input distance in kilometer
	int kilometer = input.nextInt();
	
	
	
	
	// Converting kilometer to Miles
	double miles = kilometer * 0.625 ;
	
	// Display the distance in miles
	System.out.println("The total miles is " + miles + " mile for the given " + kilometer + " km " );
	
	//close the Scanner object
	input.close();
	
	
	}




} 