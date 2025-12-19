// Create AverageHeight Class to compute the mean height of the football players 
import java.util.Scanner;

class AverageHeight {
   public static void main(String[] args) {
     // Create a Scanner Object
    Scanner input = new Scanner(System.in);
	  
	// Declare the 1D Array
	int arrayLength = 11;
	int numberOfPlayers = arrayLength;
    double[] arr = new double[arrayLength];
	  

    // Take input from the user for a number
	for(int i = 0 ; i < arrayLength ; i++ ){
		System.out.print("Enter the height of player " + (i+1) + " : ");
		arr[i] = input.nextDouble();
		  
	}
	
	
    // Computing the mean height
	double sum = 0.0;
    for(int i = 0 ; i < arrayLength ; i++ ){
		sum += arr[i];
		  
	}
	double meanHeight = sum / numberOfPlayers;
	 
	 // displaying the mean height
		System.out.println("The mean height of the football team is : " + meanHeight);    

      // Close the Scanner Object
      input.close();
   }
}
