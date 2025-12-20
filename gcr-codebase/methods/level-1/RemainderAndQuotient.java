 //importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name RemainderAndQuotient and compute the remainder and quotient of number
public class RemainderAndQuotient{
	
	
	// computing the remainder and quotient of number
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int[] result = new int[2];
		result[0] = number % divisor;
		result[1] = number / divisor;
		
		return result;
	}

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	System.out.println("Enter the divisor : ");
	int divisor = input.nextInt();
	
	

	
	//Calling the FindRemainderAndQuotient method to compute the reminder and quotient of number
	
	int[] result = RemainderAndQuotient.findRemainderAndQuotient(number, divisor);
	
	//displaying the smallest and largest number
	System.out.println("The number " + number + " dividedd by " + divisor + " gives remainder " + result[0] + " and quotient " + result[1] );
	

	//close the Scanner object
	input.close();
	
	
	
	}




} 