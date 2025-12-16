

import java.util.Scanner; // 1. Import the Scanner class

public class AreaOfCircle {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for radius of circle
        System.out.print("Enter the radius of circle: ");

        // Read the user's input of radius of circle  (integer)
        int radius = scanner.nextInt();

       	final double PI= 3.14; // Initialized pie as constant
	
        
       	double area = PI * radius * radius;  // Calculating the area of circle

        // Display the area of circle
        System.out.println("The area of circle is " +area);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
