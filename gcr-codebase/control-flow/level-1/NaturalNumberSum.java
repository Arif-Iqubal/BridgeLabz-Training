//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name NaturalNumberSum and displaying the sum of natural number 
public class NaturalNumberSum{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	int temp = number;
	
	// Checking and displaying the number is natural or not the sum of natural number
	if(number>0){
		int sumFormula = ((number * (number + 1)) / 2 );
		int sumOfNaturalNumber = 0 ;
		
		while (temp != 0){
			sumOfNaturalNumber += temp;
			temp--;
			
		}
		if(sumFormula == sumOfNaturalNumber){
			System.out.println("The sum of " + number + "  natural numbers by formula " + sumFormula + " and by while loop " + sumOfNaturalNumber + " are equal " );
			System.out.println("The sum of " + number + "  natural numbers is " + sumFormula );
			
		}else{
						System.out.println("The sum of " + number + "  natural numbers by formula " + sumFormula + " and by while loop " + sumOfNaturalNumber + " are not equal " );

			
		}
		
		
	}
	else{
		System.out.println("The number " + number + " is not a natural number ");
	}

	//close the Scanner object
	input.close();
	
	
	
	}




} 