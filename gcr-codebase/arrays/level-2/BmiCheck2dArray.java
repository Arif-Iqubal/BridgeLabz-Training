//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name BmiCheck2dArray and calculating the BMI of person
public class BmiCheck2dArray{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking input for number of person
	System.out.println("Enter the number of persons: ");
	int arraySize = input.nextInt();
	
	//Declaring 2d array
	 double[][] personData = new double[arraySize][3];
	String[] weightStatus = new String[arraySize];
	
	// Taking user details input
	for(int i =0 ; i<arraySize ; i++){
		System.out.println("Enter user weight of person " + (i+1) + " in kg : ");
		double weight = input.nextInt();
		System.out.println("Enter user height of person " + (i+1) + " in meters : ");
		double height = input.nextInt();
		if((weight < 0) || (height<0)){
			System.out.println("Enter positive values ");
			i--;
			continue;
		}
		personData[i][0] = weight; 
		personData[i][1] = height; 

	}
	
	
	//calculating the BMI of the user and storing in array
	
	for(int i = 0 ; i < arraySize ; i++){
		personData[i][2] = personData[i][0] / ( personData[i][1] * personData[i][1] );
		
	}
		
	
	
	// Storing the bmi status of the user
	for(int i = 0 ; i < arraySize ; i++){
		if(personData[i][2] <= 18.4 ){
			weightStatus[i] = "Underweight";
		}
		else if(personData[i][2] <= 24.9 ){
			weightStatus[i] = "normal";

		}
		else if(personData[i][2] <= 39.9 ){
			weightStatus[i] = "Overweight";

		}
		else {
			weightStatus[i] = "Obese";
			
		}
	}
	
	//Displaying the weightStatus of person
	
	for(int i = 0 ; i < arraySize ; i++){
	System.out.println("According the BMI " + personData[i][2] + " the person is " + weightStatus[i] + " with height " + personData[i][1] + " and weight " + personData[i][0]);

	}
	
	//close the Scanner object
	input.close();
	
	
	
	}




} 