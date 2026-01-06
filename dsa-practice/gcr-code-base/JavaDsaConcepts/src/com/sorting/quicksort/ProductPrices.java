package com.sorting.quicksort;

import java.util.Scanner; // Import Scanner for user input

public class ProductPrices {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user for number of products
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        // Declare array to store product prices
        int[] prices = new int[n];

        // Take product prices input
        System.out.println("Enter product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt(); // Store each price
        }

        // Call Quick Sort on the array
        quickSort(prices, 0, n - 1);

        // Display sorted product prices
        System.out.println("Sorted Product Prices (Ascending Order):");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        // Close Scanner
        sc.close();
    }

    // Quick Sort method (recursive)
    static void quickSort(int[] arr, int low, int high) {

        // Check if sub-array has more than one element
        if (low < high) {

            // Partition the array and get pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before pivot
            quickSort(arr, low, pivotIndex - 1);

            // Recursively sort elements after pivot
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition method using last element as pivot
    static int partition(int[] arr, int low, int high) {

        // Choose pivot element (last element)
        int pivot = arr[high];

        // Index of smaller element
        int i = low - 1;

        // Traverse through array
        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (arr[j] < pivot) {

                i++; // increment index of smaller element

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return pivot index
        return i + 1;
    }
}

