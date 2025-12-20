//importing Scanner class from java.util package
import java.util.Scanner;


// Create SimpleInterest Class to compute the simple interest 
class SimpleInterest {
  

   // Calculating the simple interest
   public int simpleInterest(int principal, int rate, int time) {
    int interest = (principal * rate * time) / 100;
	
    return interest;
   }

   public static void main(String[] args) {
	   
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input
	System.out.println("Enter the principal : ");
	int principal = input.nextInt();
	System.out.println("Enter the rate : ");
	int rate = input.nextInt();
	System.out.println("Enter the time : ");
	int time = input.nextInt();
	
	//creating class object
	SimpleInterest interest = new SimpleInterest();
	
	
	//Calling the simple interest method to calculate the simple interest
	
	int result = interest.simpleInterest(principal, rate, time);
	
	//displaying the simple interest
	System.out.println("The Simple Interest is "  + result +  " for Principal "  + principal +  ", Rate of Interest "  + rate +  " and Time "  + time );
	
	
	
     
   }
}
