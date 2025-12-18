//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name IsHarshadNumber and check whether the given number is Harshed or not
public class IsHarshadNumber{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	
	//coping original number
	int originalNumber = number;
	int sum = 0;
	
	//calculating sum of the digit
	while(originalNumber != 0){
		int remainder = originalNumber % 10;
		sum += remainder;
		originalNumber /= 10;
		
		
	}
	
	// Displaying the given number is harshed or not
	if (number % sum == 0 ){
		System.out.println("The number " + number + " is Harshed number");
		
	}
	else{
		System.out.println("The number " + number + " is not Harshed number");

		
	}
	//close the Scanner object
	input.close();
	
	
	
	}




} 