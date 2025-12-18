//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name IsAbundantNumber and check whether the given number is Abundant or not
public class IsAbundantNumber{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	int sum = 0;
	
	//calulating the sum of all multiples of a number
	for(int i = 1 ; i<number ; i++){
		
		if(number % i == 0){
			sum += i;
		}
		
	}
	
	// Displaying the given number is Abundant or not
	if (number < sum ){
		System.out.println("The number " + number + " is Abundant number");
		
	}
	else{
		System.out.println("The number " + number + " is not Abundant number");

		
	}
	//close the Scanner object
	input.close();
	
	
	
	}




} 