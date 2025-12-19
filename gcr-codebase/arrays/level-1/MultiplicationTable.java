// Create MultiplicationTable Class to diplay the multiplication table of given number 
import java.util.Scanner;

class MultiplicationTable {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);
	  
	  // Declare the 1D Array
	  int arrayLength = 10;
      int[] arr = new int[arrayLength];
	  

      // Take input for a number
	  System.out.print("Enter a number : ");
	  int number = input.nextInt();
	  // Calculating and storing the table of number
	  for(int i = 1 ; i <= arrayLength ; i++){
		 arr[i-1] = number * i;
	  
	  }

      // Displaying the table of number
      for(int i = 1 ; i <= arrayLength ; i++ ){
		  System.out.println(number + " * " + i + " = " + arr[i-1]);
		  
	  }
      

      // Close the Scanner Object
      input.close();
   }
}
