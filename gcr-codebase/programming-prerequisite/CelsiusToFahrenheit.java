

import java.util.Scanner; // 1. Import the Scanner class

//Program of converting Celsius to Fahrenheit

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for celsius
        System.out.print("Enter temperature as celsius: ");

        // Read the user's input of Celsius  (integer)
        int Celsius = scanner.nextInt();

       
        
       	double fahrenheit = (Celsius * 9/5.0) + 32; // converting celsius to fahrenheit

        // Display the converted temperature
        System.out.println("Fahrenheit = " +fahrenheit);

        // Close the scanner to prevent resource leaks (good practice)
        scanner.close();
    }
}
