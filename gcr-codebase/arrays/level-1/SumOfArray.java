// Create SumOfArray Class to compute the sum of all values inside array 
import java.util.Scanner;

class SumOfArray {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);
	  
	  // Declare the 1D Array
	  int arrayLength = 10;
      double[] arr = new double[arrayLength];
	  int index = 0;
	  double total = 0.0;
	  
	  

      // Take input from the user unit array size or user enter o or negative value
	  while(true){
		
		if(index > 9){
			break;
		}
		System.out.print("Enter a number : ");
		double temp = input.nextDouble();
		if(temp <= 0 ){
			break;
		}
		arr[index] = temp;
		index++;
	  
	  }

      // Computing total of the array
      for(int i = 0 ; i < arrayLength ; i++ ){
		  total += arr[i];
		  
	  }
	 
	 // displaying total of array
	 System.out.println("The total sum of array is : " + total);
      

      // Close the Scanner Object
      input.close();
   }
}
