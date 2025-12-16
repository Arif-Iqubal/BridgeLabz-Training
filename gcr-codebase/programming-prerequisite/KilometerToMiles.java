

import java.util.Scanner; //  Import the Scanner class

public class KilometerToMiles {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for Entering the distance in kilometer
        System.out.print("Enter the distance in kilometer: ");

        // Read the distance  (integer)
        int distance = scanner.nextInt();


     	double miles = distance * 0.621371; // Converting kilometer to miles

        // Display the miles
        System.out.println("Kilometers in miles is " +miles);

        // Close the scanner to prevent resource leaks (good practice)
        scanner.close();
    }
}
