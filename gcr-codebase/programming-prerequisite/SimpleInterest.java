

import java.util.Scanner; //  Import the Scanner class

public class SimpleInterest {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for Entering the principal
        System.out.print("Enter the principal : ");

        // Read the principal  (integer)
        int principal = scanner.nextInt();


        // Prompt the user for Entering the rate
        System.out.print("Enter the rate : ");

        // Read the rate  (integer)
        int rate = scanner.nextInt();


        // Prompt the user for Entering the time
        System.out.print("Enter the time : ");

        // Read the time  (integer)
        int time = scanner.nextInt();

       
       	double simpleInterest = (principal * rate * time) / 100; // Calculating the simple interest

        // Display the simple interest
        System.out.println("The simple interest is " +simpleInterest);

        // Close the scanner to prevent resource leaks (good practice)
        scanner.close();
    }
}
