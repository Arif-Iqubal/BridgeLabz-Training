//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name QuotientAndRemainder and displaying the Quotient and Remainder
public class QuotientAndRemainder{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Displaying message to user, to enter the first number
	System.out.println("Enter the first number : ");
	
	// Creating a variable integer and storing the user input for first number
	int number_1 = input.nextInt();
	
	// Displaying message to user, to enter the second number
	System.out.println("Enter the second number : ");
	
	// Creating a variable integer and storing the user input for second number
	int number_2 = input.nextInt();
	

	// calculating the Quotient and Remainder
	int quotient = number_1 / number_2;
	int remainder = number_1 % number_2;

	
	
	// displaying the Arithmetic Solutions
	System.out.println("The Quotient is " +quotient + " and Reminder is " + remainder + " of two number " + number_1 + " and " + number_2  );
	
	
	//close the Scanner object
	input.close();
	
	
	
	}




} 