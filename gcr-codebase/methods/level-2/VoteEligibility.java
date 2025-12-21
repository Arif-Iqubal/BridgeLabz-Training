// Create StudentVoteChecker Class to check the vote eligibility age of student
import java.util.Scanner;

class StudentVoteChecker {
	
	
	public static boolean canStudentVote(int age){
		if(age<18){
			return false;
		}
		 
		else{
			return true;
		}
		
		
	}
	
	
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);
	  
	  // Declare the 1D Array
	  int arrayLength = 10;
      int[] arr = new int[arrayLength];
	  

      // Take input for the age of student
	  for(int i = 0 ; i < arrayLength ; i++){
		  System.out.print("Enter the age of " + "student " + (i+1) + " : ");
		  arr[i] = input.nextInt();
	  
	  }

      // Validate the student age for vote eligibility 
      for(int i = 0 ; i < arrayLength ; i++ ){
		  if(StudentVoteChecker.canStudentVote(arr[i])){
			System.out.println("The student with the age " + arr[i] + " can vote.");
		  }
		   else{
			  System.out.println("The student with the age " + arr[i] + " cannot vote.");
		  }
	  }
      

      // Close the Scanner Object
      input.close();
   }
}
