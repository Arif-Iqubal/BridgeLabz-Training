package com.universitydigitalrecord;

public class StudentTree {

	// Storing root node of tree
	static Student root;

	// Method to create a student node and call insert method
	public static void add(String name, String branch, int semister, int roll) {
		Student student = new Student(name, branch, semister, roll);
		root = insert(student, root);

	}

	// Method to add Student node in tree
	public static Student insert(Student student, Student curr) {

		if (curr == null) {
			return student;
		}

		int roll = student.roll;
		// If key is smaller, make it left
		// child, else right child
		if (curr.roll > roll) {
			curr.left = insert(student, curr.left);
		} else {
			curr.right = insert(student, curr.right);
		}

		return curr;

	}

	// Method to display deleted student node
	static void deleteStudent(Student root, int x) {
		delStudent(root, x);
		System.out.println("-------------------------------------------------------");
		System.out.println("Student having roll number " + x + " is deleted successfully");
		System.out.println("-------------------------------------------------------");

	}

	// Method to get successor node
	static Student getSuccessor(Student curr) {
		curr = curr.right;
		while (curr != null && curr.left != null) {
			curr = curr.left;
		}
		return curr;
	}

	// Delete a Student with value x from BST
	static Student delStudent(Student root, int x) {
		if (root == null)
			return root;

		if (root.roll > x) {
			root.left = delStudent(root.left, x);
		} else if (root.roll < x) {
			root.right = delStudent(root.right, x);
		} else {
			// Student with 0 or 1 child
			if (root.left == null)
				return root.right;
			if (root.right == null)
				return root.left;

			// Student with 2 children
			Student succ = getSuccessor(root);
			root.roll = succ.roll;
			root.right = delStudent(root.right, succ.roll);
		}
		return root;
	}

	// Method to display Student tree (In-Order)
	public static void displayInfo(Student curr) {
		System.out.println("--------------------------------------------");
		System.out.println("Name\tBranch\tRoll\tSemister");
		System.out.println("--------------------------------------------");
		display(curr);
	}

	public static void display(Student curr) {

		if (curr == null)
			return;
		display(curr.left);
		System.out.println(curr.name + "\t" + curr.branch + "\t" + curr.roll + "\t" + curr.semister);
		display(curr.right);
	}

	public static void main(String[] args) {

		// adding student to tree
		add("Arif", "Aiml", 7, 6);
		add("Mohan", "cse", 7, 4);
		add("Abuzar", "cs", 7, 5);
		add("Ansh", "ex", 7, 2);
		add("Karan", "Aiml", 7, 9);
		add("Wasim", "Cse", 7, 7);

		// Displaying student tree
		displayInfo(root);

		// Calling method to delete node based on roll number
		deleteStudent(root, 4);

		// Calling method to display student tree after deletion
		displayInfo(root);

	}

}
