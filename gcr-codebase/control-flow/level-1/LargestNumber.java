//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name LargestNumber and checking which is the largest among three different number
public class LargestNumber{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for 3 different number 
	System.out.println("Enter first number : ");
	int number_1 = input.nextInt();
		System.out.println("Enter second number : ");
	int number_2 = input.nextInt();
		System.out.println("Enter third number : ");
	int number_3 = input.nextInt();
	
	// Checking and displaying which is the largest among three different number
	System.out.println("Is the first number the largest? " + ((number_1 > number_2) && (number_1 > number_3)));
	System.out.println("Is the second number the largest? " + ((number_2 > number_1) && (number_2 > number_3)));
	System.out.println("Is the third number the largest? " + ((number_3 > number_2) && (number_3 > number_1)));

	//close the Scanner object
	input.close();
	
	
	
	}




} 