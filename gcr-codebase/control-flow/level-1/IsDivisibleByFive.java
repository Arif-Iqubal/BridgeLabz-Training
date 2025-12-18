//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name IsDivisibleByFive and checking whether the given number is divisible by 5 or not.
public class IsDivisibleByFive{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	
	// Checking and displaying whether the given number is divisible by 5 or not
	System.out.println("Is the number " + number + " divisible by 5? " + (number%5==0));
	

	//close the Scanner object
	input.close();
	
	
	
	}




} 