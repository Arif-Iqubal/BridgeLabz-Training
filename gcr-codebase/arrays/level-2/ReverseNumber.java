//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name ReverseNumber and displaying number in reverse order
public class ReverseNumber{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	//user names
	

	
	// Taking user details for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	

	//Counting the digit length
	int count =0;
	int originalNumber = number;  
	while(number != 0){
		int digit = number%10;
		count++;
		number /= 10;
	}
	
	//Declaring two 1D array
	int arraySize = count;
	int[] arr = new int[arraySize];
	
	
	//Storing each digit in array
	int index = 0;
	while(originalNumber != 0){
		int digit = originalNumber%10;
		arr[index] = digit;
		index++;
		originalNumber /= 10;
	}

		
	//Displaying reverse number
	for(int i =0; i<arraySize ; i++){
			System.out.print(arr[i]);

	}
	
	


	//close the Scanner object
	input.close();
	
	
	
	}




} 