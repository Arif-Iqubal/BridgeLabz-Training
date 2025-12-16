

import java.util.Scanner; //  Import the Scanner class

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for Entering the length
        System.out.print("Enter the length : ");

        // Read the length  (integer)
        int length = scanner.nextInt();


        // Prompt the user for Entering the breadth
        System.out.print("Enter the breadth : ");

        // Read the breadth (integer)
        int breadth = scanner.nextInt();

     	int perimeter = 2 * (length + breadth); // Calculating the perimeter of rectangle

        // Display the perimeter of rectangle
        System.out.println("The perimeter of rectangle is " +perimeter);

        // Close the scanner to prevent resource leaks (good practice)
        scanner.close();
    }
}
