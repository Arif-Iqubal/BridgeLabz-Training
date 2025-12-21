 //importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name SumOfNaturalNumber and compute sum of natural number
public class SumOfNaturalNumber{
	
	
	// computing the sum of natural number
	public static int sumOfNaturalNumber(int number) {
		if(number == 1){
			return 1;
		}
		return (number + sumOfNaturalNumber(number-1));
		
	}

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	
	//checking the valid natural number
	if(number<=0){
		System.err.print("Invalid input");
		System.exit(0);
	}
	
	
	

	
	//Calling SumOfNaturalNumber method to compute sum of natural number
	
	int sum = SumOfNaturalNumber.sumOfNaturalNumber(number);
	
	//Computing sum of natural number using formula;
	int sumFormula = (number * ( number + 1)) / 2;
	
	//checking the displaying both the values are same or not
	if(sum == sumFormula){
		System.out.println("The result " + sumFormula + " from both computations is correct");
	}
	else{
		System.out.println("Not same");
	}

	

	//close the Scanner object
	input.close();
	
	
	
	}




} 