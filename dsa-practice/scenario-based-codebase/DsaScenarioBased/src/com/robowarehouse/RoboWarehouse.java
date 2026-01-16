package com.robowarehouse;

public class RoboWarehouse {

	// Method to sort package weights using Insertion Sort
	public static void insertionSort(int[] weights) {

		// Loop starts from second element since first is already considered sorted
		for (int i = 1; i < weights.length; i++) {

			int key = weights[i];
			int j = i - 1;

			// Shift heavier packages one position to the right
			while (j >= 0 && weights[j] > key) {
				weights[j + 1] = weights[j];
				j--;
			}

			// Insert the package at its correct position
			weights[j + 1] = key;
		}
	}

	// Main method to simulate robot shelf loading
	public static void main(String[] args) {

		// Initial shelf with unsorted package weights
		int[] shelf = { 10, 40, 20, 30, 25 };

		// Apply insertion sort to maintain ascending order by weight
		insertionSort(shelf);

		// Display the sorted shelf after robot loading
		for (int weight : shelf) {
			System.out.print(weight + " ");
		}
	}
}
