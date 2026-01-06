package com.sorting.mergesort;

import java.util.Scanner; // Import Scanner for user input

public class BookPrices {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user for number of books
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        // Declare array to store book prices
        int[] prices = new int[n];

        // Take book prices input
        System.out.println("Enter book prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Call merge sort on the array
        mergeSort(prices, 0, n - 1);

        // Display sorted prices
        System.out.println("Sorted Book Prices (Ascending Order):");
        for (int price : prices) {
            System.out.print(price + " ");
        }

        // Close Scanner
        sc.close();
    }

    // Method to divide the array recursively
    static void mergeSort(int[] arr, int left, int right) {

        // Base condition: if array has more than one element
        if (left < right) {

            // Find middle index
            int mid = (left + right) / 2;

            // Recursively sort left half
            mergeSort(arr, left, mid);

            // Recursively sort right half
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Method to merge two sorted subarrays
    static void merge(int[] arr, int left, int mid, int right) {

        // Sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays
        int i = 0, j = 0, k = left;

        // Compare elements and place smaller one first
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left array (if any)
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of right array (if any)
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
