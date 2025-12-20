 //importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name SmallestAndLargest and compute the sum of natural numbers
public class SmallestAndLargest{
	
	
	// computing the smallest and largest number
	public static int[] FindSmallestAndLargest(int number1, int number2, int number3) {
		int[] result = new int[2];
		if((number1 > number2) && (number1 > number3)){
			result[0] = number1;
		}
		else if((number2 > number1) && (number2 > number3)){
			result[0] = number2;
		}
		else{
			result[0] = number3;
		
		}
		
		if((number1 < number2) && (number1 < number3)){
			result[1] = number1;
		}
		else if((number2 < number1) && (number2 < number3)){
			result[1] = number2;
		}
		else{
			result[1] = number3;
		
		}
		
		return result;
	}

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input
	System.out.println("Enter first number : ");
	int number1 = input.nextInt();
	System.out.println("Enter second number : ");
	int number2 = input.nextInt();
	System.out.println("Enter third number : ");
	int number3 = input.nextInt();
	

	
	//Calling the FindSmallestAndLargest method to compute the smallest and largest
	
	int[] result = SmallestAndLargest.FindSmallestAndLargest(number1,number2,number3);
	
	//displaying the smallest and largest number
		System.out.println("The smallest number is " + result[1] + " and largest is " + result[0] );
	

	//close the Scanner object
	input.close();
	
	
	
	}




} 