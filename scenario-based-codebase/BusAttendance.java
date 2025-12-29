//Program to compute total number of student absent and present in the bus
//importing Scanner class from java.util package
import java.util.Scanner;

//Create BusAttendance class to compute total present and absent student
public class BusAttendance{

	//Method to compute and return the discount
	public static int countPresentStudent(String[] attendance){
		int totalPresent = 0;
		for(String i:  attendance){
			if(i.equals("Present")){
				totalPresent++;
			}
		}
		return totalPresent;
	}
	
	//Method to display student details
	public static void displayAttendance(String[] student, String[] attendance){
		System.out.println("Students\t(Present/Absent)");
		for(int i =0; i<student.length;i++){
			System.out.println(student[i] + "\t\t" + attendance[i]);
		}	
	}
	
	
	public static void main(String[] args){
		//Creating object of Scanner class
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		System.out.println("Mark Student attendance");
		String[] student = {"Aman","Rohan","Kasif","Arpit","Renu","Sanju","Sima"};
		int totalStudent = student.length;
		String[] attendance = new String[totalStudent];
		for(int i =0; i<totalStudent;i++){
			System.out.println("\nMark " + student[i] + " attendance \nEnter \n1 => Present\n2 => Absent");
			int temp = input.nextInt();
			switch(temp){
				case 1:{
					attendance[i] = "Present";
					break;
				}
				default:{
					attendance[i] = "Absent";
				}
			}
		}
		
		
		
		//Calling method to compute total present student
		int totalPresent = BusAttendance.countPresentStudent(attendance);
		
		//Dispaying result
		BusAttendance.displayAttendance(student, attendance);
		System.out.println();
		System.out.println("Total Students\tPresent\t\tAbsent");
		System.out.println(totalStudent + "\t\t" + totalPresent + "\t\t" + (totalStudent-totalPresent));
		
		input.close();
	
	}
}