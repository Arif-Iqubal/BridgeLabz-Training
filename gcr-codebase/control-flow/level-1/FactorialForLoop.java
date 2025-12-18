//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name FactorialForLoop and displaying the factorial of given number
public class FactorialForLoop{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	int temp = number;   // Creating and storing a temporary variable to store the value of number
	
	// Checking and displaying the number is natural or not the sum of natural number using for loop
	if(temp>=0){
		int factorial = 1 ; 
		
		for(; temp>0 ; temp--){
			
			factorial *= temp;
		
			
			
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