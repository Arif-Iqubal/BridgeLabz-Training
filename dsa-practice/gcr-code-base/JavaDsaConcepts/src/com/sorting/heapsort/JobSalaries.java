package com.sorting.heapsort;

import java.util.Scanner; // Import Scanner for user input

public class JobSalaries {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user for number of job applicants
        System.out.print("Enter number of job applicants: ");
        int n = sc.nextInt();

        // Declare array to store salary demands
        int[] salaries = new int[n];

        // Take salary input from user
        System.out.println("Enter expected salary demands:");
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt(); // Store each salary
        }

        // Perform Heap Sort
        heapSort(salaries);

        // Display sorted salaries
        System.out.println("Sorted Salary Demands (Ascending Order):");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }

        // Close Scanner
        sc.close();
    }

    // Method to perform Heap Sort
    static void heapSort(int[] arr) {

        int n = arr.length;

        // Step 1: Build Max Heap
        // Start from last non-leaf node and heapify each node
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements one by one from heap
        for (int i = n - 1; i > 0; i--) {

            // Move current root (largest) to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on reduced heap
            heapify(arr, i, 0);
        }
    }

    // Heapify subtree rooted at index i
    static void heapify(int[] arr, int heapSize, int i) {

        int largest = i;          // Initialize largest as root
        int left = 2 * i + 1;     // Left child index
        int right = 2 * i + 2;    // Right child index

        // If left child is larger than root
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {

            // Swap root with largest
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, heapSize, largest);
        }
    }
}
