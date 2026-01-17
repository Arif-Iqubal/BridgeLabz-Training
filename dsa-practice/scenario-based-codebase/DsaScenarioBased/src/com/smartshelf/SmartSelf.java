package com.smartshelf;

import java.util.ArrayList;

public class SmartSelf {
	// Initializing array to store object of books
	static Book[] bookSelf = new Book[13];
	static int bookCount = 0;

	// Method to add books
	static void addBook(String title, String author, String genre) {
		Book book = new Book(title, author, genre);

		if (bookCount == 0) {
			bookSelf[0] = book;
			bookCount++;
			return;
		} else {
			bookSelf[bookCount] = book;
			bookCount++;
		}

	}

	// Method to sort Book in a self by title
	static void sortBook() {

		for (int i = 1; i < bookSelf.length; ++i) {

			int j = i - 1;
			Book key = bookSelf[i];

			while (j >= 0 && ((bookSelf[j].title.compareTo(key.title)) > 0)) {
//	        	
				bookSelf[j + 1] = bookSelf[j];
				j--;
			}
			bookSelf[j + 1] = key;
		}

	}

	// Method to display books
	static void displayBook() {
		System.out.println("\n\nDisplaying books in self\n");
		for (int i = 0; i < bookSelf.length; i++) {

			System.out.println("Title -> " + bookSelf[i].title);

		}
	}

	public static void main(String[] args) {

		// Adding books to library book self
		addBook("The Alchemist", "Paulo Coelho", "Fiction");
		addBook("To Kill a Mockingbird", "Harper Lee", "Fiction");
		addBook("1984", "George Orwell", "Dystopian");
		addBook("Brave New World", "Aldous Huxley", "Dystopian");
		addBook("The Hobbit", "J.R.R. Tolkien", "Fantasy");
		addBook("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy");
		addBook("The Lord of the Rings", "J.R.R. Tolkien", "Fantasy");
		addBook("A Brief History of Time", "Stephen Hawking", "Science");
		addBook("The Selfish Gene", "Richard Dawkins", "Science");
		addBook("The Selfish Gene", "Richard Dawkins", "Science");
		addBook("Clean Code", "Robert C. Martin", "Technology");
		addBook("Introduction to Algorithms", "Thomas H. Cormen", "Technology");
		addBook("The Lean Startup", "Eric Ries", "Business");
		// Displaying books before sorting
		displayBook();

		// Calling method to sort books
		sortBook();

		// Displaying books after sorting
		displayBook();

	} 

}
