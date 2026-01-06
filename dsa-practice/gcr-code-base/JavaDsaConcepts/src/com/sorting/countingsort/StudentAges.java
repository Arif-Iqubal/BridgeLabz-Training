package com.sorting.countingsort;

import java.util.Scanner; // Import Scanner for user input

public class StudentAges {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask user for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Declare array to store student ages
        int[] ages = new int[n];

        // Take student ages input
        System.out.println("Enter student ages (between 10 and 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        // Call Counting Sort method
        countingSort(ages, 10, 18);

        // Display sorted ages
        System.out.println("Sorted Student Ages (Ascending Order):");
        for (int age : ages) {
            System.out.print(age + " ");
        }

        // Close Scanner
        sc.close();
    }

    // Counting Sort method
    static void countingSort(int[] arr, int minAge, int maxAge) {

        // Step 1: Create count array
        int range = maxAge - minAge + 1;
        int[] count = new int[range];

        // Step 2: Store frequency of each age
        for (int age : arr) {
            count[age - minAge]++;
        }

        // Step 3: Compute cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Create output array
        int[] output = new int[arr.length];

        // Step 5: Place elements in correct position (stable sort)
        for (int i = arr.length - 1; i >= 0; i--) {
            int age = arr[i];
            int position = count[age - minAge] - 1;
            output[position] = age;
            count[age - minAge]--;
        }

        // Step 6: Copy sorted elements back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
}
