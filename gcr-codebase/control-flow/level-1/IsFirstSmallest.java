//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name IsFirstSmallest and checking whether the first number is smallest among three given number
public class IsFirstSmallest{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for 3 different number number
	System.out.println("Enter first number : ");
	int number_1 = input.nextInt();
		System.out.println("Enter second number : ");
	int number_2 = input.nextInt();
		System.out.println("Enter third number : ");
	int number_3 = input.nextInt();
	
	// Checking and displaying whether the given first number is smallest among three numbers
	System.out.println("Is the first number the smallest? " + ((number_1 < number_2) && (number_1 < number_3)));
	

	//close the Scanner object
	input.close();
	
	
	
	}




} 