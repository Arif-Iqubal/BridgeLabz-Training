//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name FactorialWhileLoop and displaying the factorial of given number
public class FactorialWhileLoop{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	int temp = number;
	
	// Checking and displaying the number is natural or not the sum of natural number
	if(temp>=0){
		int factorial = 1 ; 
		
		while(temp != 0){
			
			factorial *= temp;
			temp--;
			
			
		}
		System.out.println("The factorial of number " + number + " is " + factorial);
		
		
	}
	else{
		System.out.println("The number " + number + " is not positive ");
	}

	//close the Scanner object
	input.close();
	
	
	
	}




} 