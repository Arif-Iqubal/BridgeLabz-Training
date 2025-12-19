// Create PositiveNegativeNumber Class to check the number is positive, negative or zero and also even or odd 
import java.util.Scanner;

class PositiveNegativeNumber {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);
	  
	  // Declare the 1D Array
	  int arrayLength = 5;
      int[] arr = new int[arrayLength];
	  

      // Take input for the 5 different numbers
	  for(int i = 0 ; i < arrayLength ; i++){
		  System.out.print("Enter the " + (i+1) + " number : ");
		  arr[i] = input.nextInt();
	  
	  }

      // Validate the number and displaying 
      for(int i = 0 ; i < arrayLength ; i++ ){
		  if(arr[i] == 0){
			System.out.println("The number " + arr[i] + " is Zero.");
			  
		  }
		  else if(arr[i] < 0){
			System.out.println("The number " + arr[i] + " is Negative.");

		  }
		   else{
			   if( arr[i] % 2 == 0 ){
				   	System.out.println("The number " + arr[i] + " is Positive and Even.");
 
			   }
			   else{
					System.out.println("The number " + arr[i] + " is Positive and Odd.");
				   
			   }
		  }
	  }
	  // Comparing first and last element of array
	  if(arr[0] == arr[arrayLength-1]){
		System.out.println("The first value " + arr[0] + " and the last value " + arr[arrayLength-1] + " are equal.");

	  }
	  else if(arr[0] < arr[arrayLength-1]){
		System.out.println("The first value " + arr[0] + " is less than last value " + arr[arrayLength-1] + " of array");

	  }
	  else{
		System.out.println("The first value " + arr[0] + " is greater than last value " + arr[arrayLength-1] + " of array");

	  }
      

      // Close the Scanner Object
      input.close();
   }
}
