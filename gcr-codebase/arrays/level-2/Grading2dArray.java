//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name Grading2dArray and calculate and display the grade of student
public class Grading2dArray{

	public static void main(String[] args){
	
		
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	
	// Taking user input for number of students
	System.out.println("Enter the number of student : ");
	int number = input.nextInt();
	
	//Declaring 1d array
	double[] mathsMarks = new double[number];
	double[] physicsMarks = new double[number];
	double[] chemistryMarks = new double[number];
	String[][] remarks = new String[number][2];
	
	// Taking user input for subject score details
	
	for(int i = 0 ; i< number; i++){
	System.out.println("Enter math's marks of student " + (i+1));
	double maths = input.nextDouble();
	System.out.println("Enter physics marks of student " + (i+1));
	double physics = input.nextDouble();
	System.out.println("Enter chemistry marks of student " + (i+1));
	double chemistry = input.nextDouble();
	if((maths < 0) || (physics < 0) || (chemistry < 0) ){
		System.out.println("Enter postive values");
		i--;
		continue;

	}
	mathsMarks[i] = maths;
	physicsMarks[i] = physics;
	chemistryMarks[i] = chemistry;
		
	}
	int totalMarks = 300;
	//calculating the percentage of student
	for(int i = 0 ; i< number; i++){
		double percentage = ((mathsMarks[i] + physicsMarks[i] + chemistryMarks[i]) / totalMarks ) * 100 ;
		remarks[i][0] = Double.toString(percentage);
	
	}
	
	//Storing the grade of student
	for(int i = 0 ; i< number; i++){
		int percentag = (int)Double.parseDouble(remarks[i][0]);
		if(percentag >= 80 ){
			remarks[i][1] = "A";
		}
		else if(percentag >= 70 ){
			remarks[i][1] = "B";
		}
		else if(percentag >= 60 ){
			remarks[i][1] = "C";
		}
		else if(percentag >= 50 ){
			remarks[i][1] = "D";
		}
		else if(percentag >= 40 ){
			remarks[i][1] = "E";
		}
		else{
		remarks[i][1] = "R";
		}
	}
	
	
	//Displaying the grade of students
	for(int i = 0 ; i< number; i++){
		System.out.println("The grade of student " + (i+1) + " is " + remarks[i][1] + " having marks : " + remarks[i][0] + " and percentage " + remarks[i][0]  );

		
	}
	
	//close the Scanner object
	input.close();
	
	
	
	}




} 