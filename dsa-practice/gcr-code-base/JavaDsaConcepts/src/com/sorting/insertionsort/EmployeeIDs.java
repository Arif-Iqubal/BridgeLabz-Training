package com.sorting.insertionsort;

import java.util.Scanner; // Import Scanner for user input

public class EmployeeIDs {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user for number of employees
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        // Declare array to store employee IDs
        int[] empIds = new int[n];

        // Take employee IDs input
        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            empIds[i] = sc.nextInt(); // Store each ID
        }

        // Insertion Sort logic
        // First element is assumed to be already sorted
        for (int i = 1; i < n; i++) {

            int key = empIds[i]; // Current element to be inserted
            int j = i - 1;

            // Shift elements of the sorted part that are greater than key
            // to one position ahead
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }

            // Insert key at its correct position
            empIds[j + 1] = key;
        }

        // Display sorted employee IDs
        System.out.println("Sorted Employee IDs (Ascending Order):");
        for (int id : empIds) {
            System.out.print(id + " ");
        }

        // Close Scanner
        sc.close();
    }
}

