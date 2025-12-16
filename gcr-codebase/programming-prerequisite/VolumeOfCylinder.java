

import java.util.Scanner; // 1. Import the Scanner class

public class VolumeOfCylinder {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for Entering height of cylinder
        System.out.print("Enter the height of cylinder : ");

        // Read the height of cylinder  (integer)
        int height = scanner.nextInt();

        // Prompt the user for Entering radius of cylinder
        System.out.print("Enter the radius of circle: ");

   	    // Read the radius of cylinder  (integer)
        int radius = scanner.nextInt();
        
	    final double PI = 3.14 ; // Initializing constant value

       	double volume = PI * radius * radius * height; // Calculating the volume of cylinder

        // Display the volume of cyclinder
        System.out.println("The volume of cylinder is " +volume);

        // Close the scanner to prevent resource leaks (good practice)
        scanner.close();
    }
}
