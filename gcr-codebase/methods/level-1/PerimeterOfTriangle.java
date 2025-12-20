//importing Scanner class from java.util package
import java.util.Scanner;


// Create PerimeterOfTriangle Class to compute the number of rounds of park needed to complete 5 km
class PerimeterOfTriangle {
  

   // Calculating the number of rounds
   public double rounds(double distance) {
    double round = 5.0 / distance ;
	
    return round;
   }
   
   // converting distance meter into kilometers
   public double meterToKilometer(double distance) {
    double meter = distance / 1000.0;
	
    return meter;
   }
   

   public static void main(String[] args) {
	   
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input
	System.out.println("Enter the first side of triangle in meters: ");
	int firstSide = input.nextInt();
	System.out.println("Enter the second side of triangle in meters: ");
	int secondSide = input.nextInt();
	System.out.println("Enter the third side of triangle in meters: ");
	int thirdSide = input.nextInt();
	
	
	//Calculating the perimeter of the park
	double perimeter = firstSide + secondSide + thirdSide;
	
	//creating class object
	PerimeterOfTriangle run = new PerimeterOfTriangle();
	
	//calling the distance converter method to convert meter into kilometers
	double distance = run.meterToKilometer(perimeter);
	
	//Calling the rounds method to calculate the number of rounds
	
	double result = run.rounds(distance);
	
	//displaying the number of rounds
	System.out.println("Athlete needs to run "  + result +  " number of rounds.");
	
	
	
     
   }
}
