// Create AgeOfStudent Class to check the vote eligibility age of student
import java.util.Scanner;

class AgeOfStudent {
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
		  if(arr[i]<0){
			  System.out.println("Invalid age");
		  }
		  else if(arr[i]<18){
			  System.out.println("The student with the age " + arr[i] + " cannot vote.");
		  }
		   else{
			  System.out.println("The student with the age " + arr[i] + " can vote.");
		  }
	  }
      

      // Close the Scanner Object
      input.close();
   }
}
