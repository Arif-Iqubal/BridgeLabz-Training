package com.list.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateList {

	// Method to rotate list to the left by k positions
	static void rotateLeft(List<Integer> list, int k) {

		int n = list.size();

		// Handle cases where k > size of list
		k = k % n;

		// Temporary list to store first k elements
		List<Integer> temp = new ArrayList<>();

		// Store first k elements
		for (int i = 0; i < k; i++) {
			temp.add(list.get(i));
		}

		// Shift remaining elements to the left
		for (int i = k; i < n; i++) {
			list.set(i - k, list.get(i));
		}

		// Add stored elements at the end
		for (int i = 0; i < temp.size(); i++) {
			list.set(n - k + i, temp.get(i));
		}
	}

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

		rotateLeft(numbers, 2);

		System.out.println("Rotated List: " + numbers);
	}
}
