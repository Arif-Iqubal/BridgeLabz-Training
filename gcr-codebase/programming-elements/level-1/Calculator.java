//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name Calculator and displaying the arithmetic operations
public class Calculator{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Displaying message to user, to enter the first number
	System.out.println("Enter the first number : ");
	
	// Creating a variable double and storing the user input for first number
	double number_1 = input.nextInt();
	
	// Displaying message to user, to enter the second number
	System.out.println("Enter the second number : ");
	
	// Creating a variable double and storing the user input for second number
	double number_2 = input.nextInt();
	

	// calculating the Arithmetic operations
	double addition = number_1 + number_2;
	double subtraction = number_1 - number_2;
	double multiplication = number_1 * number_2;
	double division = number_1 / number_2;
	
	
	// displaying the Arithmetic Solutions
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +number_1 + " and " + number_2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division );
	
	
	//close the Scanner object
	input.close();
	
	
	
	}




} 