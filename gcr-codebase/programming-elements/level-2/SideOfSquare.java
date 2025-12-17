//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name SideOfSquare and displaying the side of square

public class SideOfSquare{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Displaying message to user, to enter the perimeter of square
	System.out.println("Enter the perimeter of square : ");
	
	// Creating a variable integer and storing the height of the triangle
	int perimeter = input.nextInt();
	

	// Calculating the side of square
	double sideOfSquare = perimeter / 4 ;
	
	
	
	
	// displaying the side of square
	System.out.println("The length of the side is " + sideOfSquare + " whose perimeter is " + perimeter );
	
	
	//close the Scanner object
	input.close();
	
	
	
	}




} 