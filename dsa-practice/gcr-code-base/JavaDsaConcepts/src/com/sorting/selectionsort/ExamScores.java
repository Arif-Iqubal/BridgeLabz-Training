package com.sorting.selectionsort;

import java.util.Scanner; // Import Scanner for user input

public class ExamScores {

    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask user for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Declare array to store exam scores
        int[] scores = new int[n];

        // Take exam scores input from user
        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt(); // Store each score
        }

        // Selection Sort logic
        // Outer loop moves boundary of unsorted part
        for (int i = 0; i < n - 1; i++) {

            // Assume current index has minimum element
            int minIndex = i;

            // Find index of minimum element in remaining array
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

        // Display sorted exam scores
        System.out.println("Sorted Exam Scores (Ascending Order):");
        for (int score : scores) {
            System.out.print(score + " ");
        }

        // Close Scanner to avoid resource leak
        sc.close();
    }
}
