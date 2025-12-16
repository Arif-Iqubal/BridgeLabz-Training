

import java.util.Scanner; //  Import the Scanner class

public class PowerCalculation {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for Entering the base value
        System.out.print("Enter the base value : ");

        // Read the base  (integer)
        int base = scanner.nextInt();


        // Prompt the user for Entering the exponent
        System.out.print("Enter the exponent : ");

        // Read the exponent  (integer)
        int exponent = scanner.nextInt();

     	int power = 1 ;
	
	while(exponent != 0 ){

	power *= base;

	exponent--;
	}

        // Display the calculated power
        System.out.println("Answer is " +power);

        // Close the scanner to prevent resource leaks (good practice)
        scanner.close();
    }
}
