//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name Bmi and calculating the BMI of person
public class BmiCheck{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user details input
	System.out.println("Enter user weight in kg : ");
	double weight = input.nextInt();
	System.out.println("Enter user height in cm : ");
	double height = input.nextInt();
	
	//converting centimeter to meter
	double heightMeter = height / 100;
	
	
	//calculating the BMI of the user
		
	double bmi = weight / ( heightMeter * heightMeter );
	
	// Displaying bmi status of the user
		if(bmi <= 18.4 ){
			System.out.println("According the BMI " + bmi + " the person is underweight ");

		}
		else if(bmi <= 24.9 ){
			System.out.println("According the BMI " + bmi + " the person is normal ");

		}
		else if(bmi <= 39.9 ){
			System.out.println("According the BMI " + bmi + " the person is overweight ");

		}
		else {
			System.out.println("According the BMI " + bmi + " the person is obese ");

		}
	
	//close the Scanner object
	input.close();
	
	
	
	}




} 