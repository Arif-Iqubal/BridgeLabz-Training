package com.collector.bookstats;

import java.util.*;
import java.util.stream.Collectors;

// Service class for library statistics
public class LibraryService {

	// Get page statistics per genre
	public static Map<String, IntSummaryStatistics> getPageStatsByGenre(List<Book> books) {
		return books.stream().collect(Collectors.groupingBy(Book::getGenre, Collectors.summarizingInt(Book::getPages)));
	}
}
