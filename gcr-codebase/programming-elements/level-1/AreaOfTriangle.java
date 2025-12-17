//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name AreaOfTriangle and displaying the area of triangle

public class AreaOfTriangle{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Displaying message to user, to enter the height of triangle
	System.out.println("Enter the height of triangle : ");
	
	// Creating a variable integer and storing the height of the triangle
	int height = input.nextInt();
	
	// Displaying message to user, to enter your base of triangle
	System.out.println("Enter the base of triangle : ");
	
	// Creating a variable integer and storing the height of the triangle
	int base = input.nextInt();
	
	

	// Calculating the area of triangle
	double area = ( base * height ) / 2 ;
	
	
	
	
	// displaying the area of triangle
	System.out.println("Area of triangle is " + area );
	
	
	//close the Scanner object
	input.close();
	
	
	
	}




} 