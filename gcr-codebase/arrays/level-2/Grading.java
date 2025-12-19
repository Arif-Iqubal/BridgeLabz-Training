//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name Grading and calculate and display the grade of student
public class Grading{

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
	double[] percentage = new double[number];
	String[] grade = new String[number];
	
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
		percentage[i] = ((mathsMarks[i] + physicsMarks[i] + chemistryMarks[i]) / totalMarks ) * 100 ;
	
	}
	
	//Storing the grade of student
	for(int i = 0 ; i< number; i++){
		if(percentage[i] >= 80 ){
			grade[i] = "A";
		}
		else if(percentage[i] >= 70 ){
			grade[i] = "B";
		}
		else if(percentage[i] >= 60 ){
			grade[i] = "C";
		}
		else if(percentage[i] >= 50 ){
			grade[i] = "D";
		}
		else if(percentage[i] >= 40 ){
			grade[i] = "E";
		}
		else{
		grade[i] = "R";
		}
	}
	
	
	//Displaying the grade of students
	for(int i = 0 ; i< number; i++){
		System.out.println("The grade of student " + (i+1) + " is " + grade[i] + " having marks : " + percentage[i] + " and percentage " + percentage[i]  );

		
	}
	
	//close the Scanner object
	input.close();
	
	
	
	}




} 