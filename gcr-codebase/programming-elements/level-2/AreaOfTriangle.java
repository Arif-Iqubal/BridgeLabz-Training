//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name AreaOfTriangle and displaying the area of triangle

public class AreaOfTriangle{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Displaying message to user, to enter the height of triangle in centimeter
	System.out.println("Enter the height of triangle : ");
	
	// Creating a variable integer and storing the height of the triangle in centimeter
	int height = input.nextInt();
	
	// Displaying message to user, to enter your base of triangle in centimeter
	System.out.println("Enter the base of triangle : ");
	
	// Creating a variable integer and storing the height of the triangle in centimeter
	int base = input.nextInt();
	
	

	// Calculating the area of triangle in centimeter
	double areaInCentimeter = ( base * height ) / 2 ;
	
	// Converting the area of triangle from centimeter to inches
	double areaInInches = areaInCentimeter / 2.54 ;
	
	
	
	
	// displaying the area of triangle
	System.out.println("The Area of the triangle in sq in is" + areaInInches + " and sq cm is " + areaInCentimeter );
	
	
	//close the Scanner object
	input.close();
	
	
	
	}




} 