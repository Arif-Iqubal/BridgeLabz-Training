//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name CountDigit and count the number of digit in a number
public class CountDigit{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	
	//coping original number
	int originalNumber = number;
	int count = 0;
	
	//calculating sum of cube of digit of number
	while(originalNumber != 0){
		int remainder = originalNumber % 10;
		count++;
		originalNumber /= 10;
		
		
	}
	
	// Displaying the given number is prime or not
		System.out.println("The number of digit in number " + number + " is " + count);
	
	//close the Scanner object
	input.close();
	
	
	
	}




} 