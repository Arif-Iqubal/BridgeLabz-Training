// Create CopyArray Class to compute the factor of the given number 
import java.util.Scanner;

class CopyArray {
   public static void main(String[] args) {
     // Create a Scanner Object
    Scanner input = new Scanner(System.in);
	
	
    // Take input for the number of rows and column it 2d array
	System.out.print("Enter number of rows : ");
	int row = input.nextInt();
	System.out.print("Enter number of column : ");
	int column = input.nextInt();
	
	
	// Declare 2D Array
	int[][] arr2d = new int[row][column];

	//Taking input for 2d array
	System.out.print("Enter 2d array value : ");
	for(int i = 0 ; i < row ; i++){
		for(int j = 0 ; j < column ; j++){
			arr2d [i][j] = input.nextInt();
		
		}
		
	}
	
	//Coping 2d array to single array
	int[] arr1d = new int [row * column];
	int index = 0;
	for(int i = 0 ; i < row ; i++){
		for(int j = 0 ; j < column ; j++){
			arr1d [index] = arr2d[i][j];
			index++;
		
		}
		
	}
	System.out.println("The 2D	array is Successfully copied in 1D array");

      // Close the Scanner Object
      input.close();
   }
}
