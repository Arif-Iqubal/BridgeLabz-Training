package com.collector.wordfrequency;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

	public static void main(String[] args) {

		String paragraph = "java streams make java code clean and streams are powerful";

		// Splitting paragraph into words
		String[] words = paragraph.split("\\s+");

		// Counting word frequency using Collectors.toMap()
		Map<String, Integer> wordCountMap = Arrays.stream(words).collect(Collectors.toMap(word -> word, // key: word
				word -> 1, // value: initial count
				Integer::sum // merge function for duplicates
		));

		// Printing word frequencies
		wordCountMap.forEach((word, count) -> System.out.println(word + " : " + count));
	}
}
