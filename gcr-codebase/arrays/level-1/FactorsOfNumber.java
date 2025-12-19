// Create FactorsOfNumber Class to compute the factor of the given number 
import java.util.Scanner;

class FactorsOfNumber {
   public static void main(String[] args) {
     // Create a Scanner Object
    Scanner input = new Scanner(System.in);
	
	
    // Take input from the user for a number
	System.out.print("Enter a number : ");
	int number = input.nextInt();
	
	
	// Declare 1D Array
	int maxFactor = 10;
	int index = 0;
	int[] arr = new int[maxFactor];
	boolean reachMaxFactor = false;
	
	

	

    // computing the factor of given number
	int tempFactor = 0;
	for(int i = 1 ; i <= number ; i++ ){
		if(number % i == 0){
			
			if(index == maxFactor){
				maxFactor = maxFactor * 2;
				int[] temp = new int[maxFactor]; 	//creating temp array
				for(int j =0; j<index ; j++){      	//copying old elements to new array
					
					temp[j] = arr[j];        		//assign new array
				}
				arr = temp ;
				
				
			}
			
			
			arr[index] = i;
			index++;
		}
		  
	}
	
	//Displaying the factors
	System.out.println("The factors of the number " + number + " are : ");
		for(int i = 0 ; i < index ; i++){
			System.out.print(arr[i] + " ");
		}
	


      // Close the Scanner Object
      input.close();
   }
}
