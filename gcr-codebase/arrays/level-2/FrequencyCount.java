//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name FrequencyCount and displaying the frequency of digit in number
public class FrequencyCount{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	//user names
	

	
	// Taking user details for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	
	
	//Declaring two 1D array
	int arraySize = 10;
	int[] arr = new int[arraySize];
	

	//Counting the frequency of the digits
	  
	while(number != 0){
		int digit = number%10;
		arr[digit]++;
		number /= 10;
	}
	
		
	//Displaying the frequency of each digit
	for(int i =0; i<arraySize ; i++){
			System.out.println("The frequency of " + i + " is " + arr[i]);

	}
	
	


	//close the Scanner object
	input.close();
	
	
	
	}




} 