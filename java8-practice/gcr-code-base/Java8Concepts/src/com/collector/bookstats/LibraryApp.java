package com.collector.bookstats;

import java.util.*;

//Main class
public class LibraryApp {

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(new Book("Java Basics", "Programming", 450),
				new Book("Advanced Java", "Programming", 600), new Book("World History", "History", 300),
				new Book("Modern History", "History", 520), new Book("Short Stories", "Literature", 200));

		// Fetch statistics per genre
		Map<String, IntSummaryStatistics> statsByGenre = LibraryService.getPageStatsByGenre(books);

		// Display statistics
		statsByGenre.forEach((genre, stats) -> {
			System.out.println("Genre: " + genre);
			System.out.println("Total Pages   : " + stats.getSum());
			System.out.println("Average Pages : " + stats.getAverage());
			System.out.println("Max Pages     : " + stats.getMax());
			System.out.println();
		});
	}
}
