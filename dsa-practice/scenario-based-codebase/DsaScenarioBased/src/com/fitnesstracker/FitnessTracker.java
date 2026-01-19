package com.fitnesstracker;

public class FitnessTracker {

	static int listSize = 0; // Static variable to store size of users
	static User[] userList = new User[listSize]; // User array to store User object

	// Static method to add User to array list
	public static void addUser(String name, int stepCount) {
		User user = new User(name, stepCount);
		if (listSize <= userList.length) {
			User[] temp = new User[++listSize];
			for (int i = 0; i < listSize - 1; i++) {
				temp[i] = userList[i];
			}
			temp[listSize - 1] = user;
			userList = temp;
			System.out.println(listSize + ") user added to leader board successfully ");
		}

	}

	// Method to call sort using bubble sort
	public static void sort() {
		for (int i = 0; i < userList.length; i++) {
			for (int j = i; j < userList.length; j++) {
				if (userList[i].stepsCount < userList[j].stepsCount) {
					User temp = userList[i];
					userList[i] = userList[j];
					userList[j] = temp;
				}
			}
		}
	}

	// Method to display user details in leader board
	public static void displayLeaderBoard() {
		System.out.println("-----------------------------");
		System.out.println("Leader Board");
		System.out.println("-----------------------------");
		System.out.println("Name\t\tStep Count");
		System.out.println("-----------------------------");
		int i = 1;
		for (User u : userList) {
			System.out.println((i) + " ) " + u.name + "\t" + u.stepsCount);
			i++;
		}
		System.out.println("-----------------------------");

	}

	public static void main(String[] args) {

		// Adding user to leader board list
		addUser("Arif", 8450);
		addUser("Rahul", 10230);
		addUser("Sneha", 7650);
		addUser("Amit	", 12040);
		addUser("Pooja", 9340);
		addUser("Karan", 15620);
		addUser("Neha", 6890);
		addUser("Vikram", 11075);
		addUser("Anjali", 9800);
		addUser("Rohit", 13450);
		addUser("Priya", 7200);
		addUser("Sahil", 8900);
		addUser("Meera", 10430);
		addUser("Nikhil", 12560);
		addUser("Kavita", 9600);

		// Calling method to sort leader board
		sort();

		// Calling method to display user details in leader board
		displayLeaderBoard();

	}

}
