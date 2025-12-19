// Create OddEvenArray Class to compute the odd even number upto the user input number 
import java.util.Scanner;

class OddEvenArray {
   public static void main(String[] args) {
     // Create a Scanner Object
    Scanner input = new Scanner(System.in);
	
	
    // Take input from the user for a number
	System.out.print("Enter a number : ");
	int number = input.nextInt();
	
	
	// Validate the user input number, if negative state invalid and exit 
    if (number < 0) {
        System.err.println("Invalid Number.");
        System.exit(0);
    }

	
	
	// Declare two 1D Array even and odd
	int arrayLength = (number / 2) + 1;
	int[] odd = new int[arrayLength];
	int[] even = new int[arrayLength];
	  

    // computing and storing even odd iteration upto given number
	int evenIndex = 0;
	int oddIndex = 0;
	for(int i = 1 ; i <= number ; i++ ){
		if(i % 2 == 0){
			even[evenIndex] = i ;
			evenIndex++;
		}else{
			odd[oddIndex] = i ;
			oddIndex++;
			
		}
		  
	}
	//Displaying even and odd numbers
	System.out.println("The even elements are :");
	for(int i = 0 ; i < arrayLength ; i++){
		if(even[i]==0){
			break;
		}
		System.out.print(even[i] + " ");
	}
	System.out.println("");
	System.out.println("The odd elements are : ");
	for(int i = 0 ; i < arrayLength ; i++){
		if(odd[i]==0){
			break;
		}
		System.out.print(odd[i] + " ");
	}

      // Close the Scanner Object
      input.close();
   }
}
