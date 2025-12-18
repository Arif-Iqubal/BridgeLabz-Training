//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name IsPrime and check whether the given number is prime or not
public class IsPrime{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	
	//checking the number is prime or not
	boolean isPrime = true;
	
	for(int i = 2; i*i <= number ; i++){
		if(number % i == 0){
			isPrime = false;
			break;
		}
	}
	
	// Displaying the given number is prime or not
	if (isPrime){
		System.out.println("The number " + number + " is prime");
		
	}
	else{
		System.out.println("The number " + number + " is not prime");

		
	}
	//close the Scanner object
	input.close();
	
	
	
	}




} 