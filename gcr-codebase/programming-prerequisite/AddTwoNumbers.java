

import java.util.Scanner; // 1. Import the Scanner class

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for first number
        System.out.print("Enter first number: ");

        // Read the user's input of first number  (integer)
        int num1 = scanner.nextInt();

        // Prompt the user for their age
        System.out.print("Enter second number: ");

        //  Read the user's input of second number (integer)
        int num2 = scanner.nextInt();
        
       	int sum = num1 + num2;  // Calculating and storing the value of sum of two numbers

        // Display the user's sum of two numbers
        System.out.println("The sum of Number-1 and Number-2 is " +sum);

        // Close the scanner to prevent resource leaks (good practice)
        scanner.close();
    }
}
