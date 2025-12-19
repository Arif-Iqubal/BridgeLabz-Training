//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name Bmi and calculating the BMI of person
public class BmiCheck{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking input for number of person
	System.out.println("Enter the number of persons: ");
	int arraySize = input.nextInt();
	
	//Declaring 1d array
	double[] weight = new double[arraySize];
	double[] height = new double[arraySize];
	double[] bmi = new double[arraySize];
	String[] weightStatus = new String[arraySize];
	
	// Taking user details input
	for(int i =0 ; i<arraySize ; i++){
		System.out.println("Enter user weight of person " + (i+1) + " in kg : ");
		weight[i] = input.nextInt();
		System.out.println("Enter user height of person " + (i+1) + " in meters : ");
		height[i] = input.nextInt();
		
	}
	
	
	//calculating the BMI of the user and storing in array
	
	for(int i = 0 ; i < arraySize ; i++){
		bmi[i] = weight[i] / ( height[i] * height[i] );
		
	}
		
	
	
	// Storing the bmi status of the user
	for(int i = 0 ; i < arraySize ; i++){
		if(bmi[i] <= 18.4 ){
			weightStatus[i] = "Underweight";
		}
		else if(bmi[i] <= 24.9 ){
			weightStatus[i] = "normal";

		}
		else if(bmi[i] <= 39.9 ){
			weightStatus[i] = "Overweight";

		}
		else {
			weightStatus[i] = "Obese";
			
		}
	}
	
	//Displaying the weightStatus of person
	
	for(int i = 0 ; i < arraySize ; i++){
	System.out.println("According the BMI " + bmi[i] + " the person is " + weightStatus[i] + " with height " + height[i] + " and weight " + weight[i]);

	}
	
	//close the Scanner object
	input.close();
	
	
	
	}




} 