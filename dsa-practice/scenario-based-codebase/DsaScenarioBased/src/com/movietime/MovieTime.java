package com.movietime;

import java.time.LocalTime;

public class MovieTime {

	static int listSize = 0; // Static variable to store size of Show
	static Show[] ShowList = new Show[listSize]; // Show array to store Show object

	// Static method to add Show to array list
	public static void addShow(String name, LocalTime time) {
		Show Show = new Show(name, time);
		if (listSize <= ShowList.length) {
			Show[] temp = new Show[++listSize];
			for (int i = 0; i < listSize - 1; i++) {
				temp[i] = ShowList[i];
			}
			temp[listSize - 1] = Show;
			ShowList = temp;
			System.out.println(listSize + ") Show added successfully ");
		}

		// Applying insertion sort at real time
		int j = listSize - 2;
		while (j >= 0 && ShowList[j].showTime.isAfter(Show.showTime)) {

			ShowList[j + 1] = ShowList[j];
			j--;
		}
		ShowList[j + 1] = Show;
	}

	// Static method to display Show details
	public static void displayInfo() {
		System.out.println("----------------------------------------------------------");
		System.out.println("-------------- Show Registration Details ---------------");
		System.out.println("----------------------------------------------------------");
		System.out.println("Show Name\tShow Time");
		System.out.println("------------------------------------");
		for (int i = 0; i < listSize; i++) {
			System.out.println(ShowList[i].name + "\t\t" + ShowList[i].showTime);
		}
		System.out.println("------------------------------------");
	}

	// Main method
	public static void main(String[] args) {

		// Adding Show to array list
		addShow("Salaar", LocalTime.of(1, 20, 33));
		addShow("Welcome", LocalTime.of(10, 20, 33));
		addShow("KGF", LocalTime.of(19, 20, 33));
		addShow("Tiger", LocalTime.of(1, 23, 33));
		addShow("Sultan", LocalTime.of(1, 22, 33));
		addShow("Pathan", LocalTime.of(1, 20, 31));
		addShow("Dangal", LocalTime.of(1, 20, 13));

		// Calling method to display Show details
		displayInfo();

	}

}
