 //importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name TrigonometicFunction and compute the trigonometric values
public class TrigonometicFunction{
	
	
	// computing the trigonometric fucntion
	public static void calculateTrigonometicFunction(double angle) {
		//Converting degree into radian
		double angleInRadian = Math.toRadians(angle);
		double sine = Math.sin(angleInRadian);
		double cosine = Math.cos(angleInRadian);
		double tangent = Math.tan(angleInRadian);
		
		//Displaying the value of trigonometry
		System.out.println("The trigonometric value of angle " + angle + " are sin : " + sine + " , cos : " + cosine + " and tan : " + tangent);
		
	}

	public static void main(String[] args){
		
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input
	System.out.println("Enter the angle : ");
	double angle = input.nextDouble();
	
	
	

	
	//Calling the FindTrigonometicFunction method to compute and display the trigonometic values
	
	TrigonometicFunction.calculateTrigonometicFunction(angle);
	

	

	//close the Scanner object
	input.close();
	
	
	
	}




} 