

import java.util.Scanner; //  Import the Scanner class

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for Entering the first number
        System.out.print("Enter the first number : ");

        // Read the first  (integer)
        int first = scanner.nextInt();


       // Prompt the user for Entering the second number
        System.out.print("Enter the second number : ");

        // Read the second  (integer)
        int second = scanner.nextInt();


	// Prompt the user for Entering the third number
        System.out.print("Enter the third number : ");

        // Read the third  (integer)
        int third = scanner.nextInt();

	int average = (first + second + third) / 3 ; // calculating average of three number 

        // Display the average of three number
        System.out.println("Answer is " +average);

        // Close the scanner to prevent resource leaks (good practice)
        scanner.close();
    }
}
