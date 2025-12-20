 //importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name SumOfNaturalNumber and compute the sum of natural numbers
public class SumOfNaturalNumber{
	
	
	// computing the sum of natural number
	public int sum(int number) {
		int result = 0;
		
		for(int i =1; i<= number ; i++){
			result += i ;
		}
		
		
		return result;
	}

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input
	System.out.println("Enter a natural number : ");
	int number = input.nextInt();
	
	//creating class object
	SumOfNaturalNumber naturalNumber = new SumOfNaturalNumber();
	
	//Calling the sum  method to calculate sum of natural number
	
	int result = naturalNumber.sum(number);
	
	//displaying the sum of natural number
		System.out.println("The sum of natural number " + number + " is " + result );
	

	//close the Scanner object
	input.close();
	
	
	
	}




} 