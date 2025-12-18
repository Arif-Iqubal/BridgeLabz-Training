//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name IsArmstrong and check whether the given number is Armstrong or not
public class IsArmstrong{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	
	//coping original number
	int originalNumber = number;
	int sum = 0;
	
	//calculating sum of cube of digit of number
	while(originalNumber != 0){
		int remainder = originalNumber % 10;
		int cubeOfDigit = remainder * remainder * remainder;
		sum += cubeOfDigit;
		originalNumber /= 10;
		
		
	}
	
	// Displaying the given number is prime or not
	if (number == sum){
		System.out.println("The number " + number + " is Armstrong");
		
	}
	else{
		System.out.println("The number " + number + " is not Armstrong");

		
	}
	//close the Scanner object
	input.close();
	
	
	
	}




} 