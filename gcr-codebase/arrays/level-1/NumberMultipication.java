// Create NumberMultipication Class to compute the multiplication table of given number with 6 to 9 
import java.util.Scanner;

class NumberMultipication {
   public static void main(String[] args) {
     // Create a Scanner Object
    Scanner input = new Scanner(System.in);
	  
	// Declare the 1D Array
	int arrayLength = 4;
    int[] arr = new int[arrayLength];
	  

    // Take input from the user for a number
	System.out.print("Enter a number : ");
	int number = input.nextInt();
	int tempMultiple = 6;
	
	
    // Computing the multipication of the number
    for(int i = 0 ; i < arrayLength ; i++ ){
		  arr[i] = number * tempMultiple ;
		  tempMultiple++;
		  
	}
	 
	 // displaying multiple table
	for(int i = 1 ; i <= arrayLength ; i++ ){
		System.out.println(number + " * " + (i+5) + " = " + arr[i-1]);
		  
	}      

      // Close the Scanner Object
      input.close();
   }
}
