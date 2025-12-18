//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name PositiveOrNegative and checking whether the given number is positive or negative
public class PositiveOrNegative{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	
	// Checking and displaying whether the given number is positive or negative or zero
	if(number > 0){
		System.out.println("The number " + number + " is positive ");
		
	}
	else if (number < 0){
		System.out.println("The number " + number + " is negative ");
	}
	else{
		System.out.println("The number " + number + " is zero ");
	}

	//close the Scanner object
	input.close();
	
	
	
	}




} 