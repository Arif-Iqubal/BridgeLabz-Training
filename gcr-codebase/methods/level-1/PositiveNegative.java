//importing Scanner class from java.util package
import java.util.Scanner;


// Create PositiveNegative Class to compute the given number is positive negative or zero
class PositiveNegative {
  

   // Returning the given number is positive negative or zero
   public int positiveOrnegativeOrzero(double number) {
    if(number==0){
		return 0;
	}
	else if(number<0){
		return -1;
	}
	else{
		return 1;
	}
   }
   

   public static void main(String[] args) {
	   
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	
	//creating class object
	PositiveNegative sign = new PositiveNegative();
	
	//Calling the positiveOrnegativeOrzero method to return number sign
	
	int result = sign.positiveOrnegativeOrzero(number);
	
	//displaying the number sign
	System.out.println("The given number returns "  + result);
	
	
	
     
   }
}
