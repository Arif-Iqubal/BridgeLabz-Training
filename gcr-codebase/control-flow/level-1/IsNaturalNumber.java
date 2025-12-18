//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name IsNaturalNumber and checking the given number is natural number or not
public class IsNaturalNumber{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	
	
	// Checking and displaying the number is natural or not the sum of natural number
	if(number>0){
		int sum = ((number * (number + 1)) / 2 );
		System.out.println("The sum of " + number + "  natural numbers is " + sum );
		
	}
	else{
		System.out.println("The number " + number + " is not a natural number ");
	}

	//close the Scanner object
	input.close();
	
	
	
	}




} 