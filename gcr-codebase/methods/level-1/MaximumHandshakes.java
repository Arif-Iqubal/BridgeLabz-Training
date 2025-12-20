//importing Scanner class from java.util package
import java.util.Scanner;


// Create MaximumHandshakes Class to compute the maximum possible handshakes
class MaximumHandshakes {
  

   // Calculating the maximum possible handshakes
   public int maxHandshakes(int number) {
    int handshakes = (number * (number - 1)) / 2;
	
    return handshakes;
   }

   public static void main(String[] args) {
	   
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input
	System.out.println("Enter the number of student: ");
	int number = input.nextInt();

	
	//creating class object
	MaximumHandshakes handshakes = new MaximumHandshakes();
	
	
	//Calling the maxhands method to calculate the simple interest
	
	int result = handshakes.maxHandshakes(number);
	
	//displaying the simple interest
	System.out.println("The possible handshakes is "  + result +  " for number of student "  + number);
	
	
	
     
   }
}
