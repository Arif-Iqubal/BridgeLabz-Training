 //importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name TotalSumLoop and displaying the total sum of user input until get 0 (zero) or smaller than 0 (zero)  as input
public class TotalSumLoop{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking input from user
	System.out.println("Enter a number : ");
	double number = input.nextInt();
	double total = 0.0 ;
	
	// Looping until user enter 0
	
	while(number != 0){
		total += number;
		System.out.println("Enter a number again : ");
		number = input.nextInt();
		if(number <1){
				break;  // using break in case user enter number smaller or equal than 0(zero)

		}
		
	}
	
	//Displaying the total sum
	System.out.println("The total sum is : " + total);

	//close the Scanner object
	input.close();
	
	
	
	}




} 