package com.sorting.bubblesort;


import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Take marks input from user
        System.out.println("Enter student marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        boolean swapped;

        // Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {

            swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                if (marks[j] > marks[j + 1]) {
                    // Swap elements
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps happened, array is already sorted
            if (!swapped) {
                break;
            }
        }

        // Display sorted marks
        System.out.println("Sorted Student Marks (Ascending Order):");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        sc.close();
    }
}
