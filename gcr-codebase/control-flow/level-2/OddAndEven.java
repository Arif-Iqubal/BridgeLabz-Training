//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name OddAndEven and displaying the odd and even occurance of number
public class OddAndEven{

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	
	// Checking and displaying the number iterations as odd and even
	if(number > 0){ 
		
			System.out.println("The iteration from 1 to " + number + " is ");
		
		for(int i = 1; i<= number ; i++){
			
			//Checking whether the iteration is even or odd and displaying it
			if( i % 2 == 0 ) {
				System.out.println("The number " + i + " is even");
			}
			else {
				System.out.println("The number " + i + " is odd");
			}
			
		}
	
		
		
	}
	else{
		System.out.println("The number " + number + " is not natural number ");
	}

	//close the Scanner object
	input.close();
	
	
	
	}




} 