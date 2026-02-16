package com.logicoperations;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LogicalStreamQuestions {

	public static void main(String[] args) {
//		1.Character Frequency Count
//		Input: "banana"
//		Output: {b=1, a=3, n=2}
		System.out.println("-----------------------------------------------------------------------------");
		String input1 = "banana";
		Map<Character, Long> result1 = input1.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println("Character Frequency Count");
		System.out.println(result1);

//		2.Word Frequency Count
//		Input: "java is java and java is fast"
//		Output: {java=3, is=2, and=1, fast=1}
		System.out.println("-----------------------------------------------------------------------------");
		String input2 = "java is java and java is fast";
		Map<String, Long> result2 = Arrays.stream(input2.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println("Word Frequency Count");
		System.out.println(result2);

//		3.First Non-Repeating Character
//
//		Input: "stress"
//		Output: t
		System.out.println("-----------------------------------------------------------------------------");

		String input3 = "stress";
		char result3 = input3.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
		System.out.println("First Non-Repeating Character of " + input3);
		System.out.println(result3);

//		4.All Non-Repeating Characters
//
//		Input: "programming"
//		Output: p o g r a i n (only chars with count = 1)
		System.out.println("-----------------------------------------------------------------------------");

		String input4 = "programming";
		List<Character> result4 = input4.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).toList();
		System.out.println("All Non-Repeating Characters of \n" + input4);
		System.out.println(result4);

//		5.Remove Duplicate Characters
//		Input: "banana"
//		Output: "ban"
		System.out.println("-----------------------------------------------------------------------------");
		String input5 = "banana";
		String result5 = input5.chars().distinct().mapToObj(x -> String.valueOf((char) x))
				.collect(Collectors.joining());
		System.out.println("Remove Duplicate Characters\n" + input5);
		System.out.println(result5);

//		6.Remove Repeating Characters (Keep Only Unique Once)
//		Input: "aabbccdde"
//		Output: "e"
		System.out.println("-----------------------------------------------------------------------------");

		String input6 = "aabbccdde";
		String result6 = input6.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).map(e -> String.valueOf(e.getKey()))
				.collect(Collectors.joining());
		System.out.println("Remove Repeating Characters (Keep Only Unique Once)\n" + input6);
		System.out.println(result6);

//		7.Remove Non-Alphanumeric Characters
//		Input: "ja@va#8!!"
//		Output: "java8"

		System.out.println("-----------------------------------------------------------------------------");

		String input7 = "ja@va#8!!";
		String result7 = input7.chars().filter(Character::isLetterOrDigit).mapToObj(x -> (char) x)
				.map(x -> String.valueOf((char) x)).collect(Collectors.joining());
		System.out.println("Remove Non-Alphanumeric Characters\n" + input7);
		System.out.println(result7);

//		8.Keep Only Alphabets
//		Input: "java8stream2025"
//		Output: "javastream"
		System.out.println("-----------------------------------------------------------------------------");

		String input8 = "java8stream2025";
		String result8 = input8.chars().filter(Character::isLetter).mapToObj(x -> (char) x)
				.map(x -> String.valueOf((char) x)).collect(Collectors.joining());
		System.out.println("Keep Only Alphabets\n" + input8);
		System.out.println(result8);

//		9.Keep Only Digits
//
//		Input: "orderId=AB123XZ9"
//		Output: "1239"
		System.out.println("-----------------------------------------------------------------------------");

		String input9 = "orderId=AB123XZ9";
		String result9 = input9.chars().filter(Character::isDigit).mapToObj(x -> (char) x)
				.map(x -> String.valueOf((char) x)).collect(Collectors.joining());
		System.out.println("Keep Only Digits\n" + input9);
		System.out.println(result9);

//		10.Count Each Character Except Spaces
//
//		Input: "java stream"
//		Output: frequency map without space
		System.out.println("-----------------------------------------------------------------------------");

		String input10 = "java stream";
		Map<Character, Long> result10 = input10.chars().filter(c -> c != ' ').mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Count Each Character Except Spaces\n" + input10);
		System.out.println(result10);

//		1. Count vowels in a string using Stream
//		Input: "programming"
//		Output: 3
		System.out.println("-----------------------------------------------------------------------------");
		String input11 = "programming";
		Long result11 = Arrays.stream(input11.split("")).filter(c -> "aeiouAEIOU".indexOf(c) != -1).count();
		System.out.println("Count vowels in a string using Stream\n" + input11);
		System.out.println(result11);

//		2. Count number of words in a sentence
//		Input: "Java is very powerful"
//		Output: 4
		String input12 = "Java is very powerful";
		Long result12 = Arrays.stream(input12.split(" ")).count();
		System.out.println("Count number of words in a sentence\n" + input12);
		System.out.println(result12);
		System.out.println("-----------------------------------------------------------------------------");

//		3. Find even numbers from list
//		Input: [2,5,7,8,10,13]
//		Output: [2,8,10]
		List<Integer> input13 = Arrays.asList(2, 5, 7, 8, 10, 13);
		List<Integer> result13 = input13.stream().filter(x -> x % 2 == 0).toList();
		System.out.println("Find even numbers from list\n" + input13);
		System.out.println(result13);
		System.out.println("-----------------------------------------------------------------------------");

//		4. Convert list of strings to uppercase
//		Input: ["java","spring","boot"]
//		Output: ["JAVA","SPRING","BOOT"]
		List<String> input14 = Arrays.asList("java", "spring", "boot");
		List<String> result14 = input14.stream().map(String::toUpperCase).toList();
		System.out.println("Convert list of strings to uppercase\n" + input14);
		System.out.println(result14);
		System.out.println("-----------------------------------------------------------------------------");

//		5. Find string length list
//		Input: ["cat","elephant","dog"]
//		Output: [3,8,3]
		List<String> input15 = Arrays.asList("cat", "elephant", "dog");
		List<Integer> result15 = input15.stream().map(String::length).toList();
		System.out.println("Find string length list\n" + input15);
		System.out.println(result15);
		System.out.println("-----------------------------------------------------------------------------");

//		6. Count strings starting with ‘a’
//		Input: ["apple","banana","ant","car"]
//		Output: 2
		List<String> input16 = Arrays.asList("apple", "banana", "ant", "car");
		Long result16 = input16.stream().filter(x -> x.startsWith("a")).count();
		System.out.println("Find string length list\n" + input16);
		System.out.println(result16);
		System.out.println("-----------------------------------------------------------------------------");

//		7. Remove empty strings
//		Input: ["java","","spring","","boot"]
//		Output: ["java","spring","boot"]
		List<String> input17 = Arrays.asList("java", "", "spring", "", "boot");
		List<String> result17 = input17.stream().filter(x -> !x.isEmpty()).toList();
		System.out.println("Remove empty strings\n" + input17);
		System.out.println(result17);

		System.out.println("-----------------------------------------------------------------------------");

//		8. Sum of all numbers using stream
//		Input: [1,2,3,4,5]
//		Output: 15
		List<Integer> input18 = Arrays.asList(1, 2, 3, 4, 5);
		int result18 = input18.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of all numbers using stream\n" + input18);
		System.out.println(result18);

		System.out.println("-----------------------------------------------------------------------------");

//		9. Find max number
//		Input: [10,25,3,99,45]
//		Output: 99
		List<Integer> input19 = Arrays.asList(10, 25, 3, 99, 45);
		int result19 = input19.stream().max(Integer::compare).get();
		System.out.println("Find max number\n" + input19);
		System.out.println(result19);

		System.out.println("-----------------------------------------------------------------------------");

//		10. Reverse each string in list
//		Input: ["java","api"]
//		Output: ["avaj","ipa"]
		List<String> input20 = Arrays.asList("java", "api");
		List<String> result20 = input20.stream().map(x -> new StringBuilder(x).reverse().toString()).toList();
		System.out.println("Reverse each string in list\n" + input20);
		System.out.println(result20);
		System.out.println("-----------------------------------------------------------------------------");

//		11. Remove duplicate elements from list
//		Input: [1,2,2,3,4,4,5]
//		Output: [1,2,3,4,5]
		List<Integer> input21 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
		List<Integer> result21 = input21.stream().distinct().toList();
		System.out.println("Remove duplicate elements from list\n" + input21);
		System.out.println(result21);
		System.out.println("-----------------------------------------------------------------------------");

//		12. Sort list in descending order
//		Input: [5,1,9,3]
//		Output: [9,5,3,1]
		List<Integer> input22 = Arrays.asList(5, 1, 9, 3);
		List<Integer> result22 = input22.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println("Sort list in descending order\n" + input22);
		System.out.println(result22);
		System.out.println("-----------------------------------------------------------------------------");

//		13. Find second highest number
//		Input: [10,40,30,20]
//		Output: 30
		List<Integer> input23 = Arrays.asList(10, 40, 30, 20);
		int result23 = input23.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Sort list in descending order\n" + input23);
		System.out.println(result23);

		System.out.println("-----------------------------------------------------------------------------");

//		14. Join strings with comma
//		Input: ["Java","Spring","Boot"]
//		Output: "Java,Spring,Boot"
		List<String> input24 = Arrays.asList("Java", "Spring", "Boot");
		String result24 = input24.stream().collect(Collectors.joining(","));
		System.out.println("Join strings with comma\n" + input24);
		System.out.println(result24);

		System.out.println("-----------------------------------------------------------------------------");

//		15. Frequency of each character
//		Input: "banana"
//		Output: {b=1, a=3, n=2}
		String input25 = "banana";
		Map<Character, Long> result25 = input25.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println("Frequency of each character\n" + input25);
		System.out.println(result25);
		System.out.println("-----------------------------------------------------------------------------");

//		16. Find numbers greater than 50
//		Input: [10,55,60,23,90]
//		Output: [55,60,90]
		List<Integer> input26 = Arrays.asList(10, 55, 60, 23, 90);
		List<Integer> result26 = input26.stream().filter(x -> x > 50).toList();
		System.out.println("Find numbers greater than 50\n" + input26);
		System.out.println(result26);
		System.out.println("-----------------------------------------------------------------------------");

//		17. Group strings by length
//		Input: ["a","bb","ccc","dd"]
//		Output: {1=[a], 2=[bb,dd], 3=[ccc]}
		List<String> input27 = Arrays.asList("a", "bb", "ccc", "dd");
		Map<Integer, List<String>> result27 = input27.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(" Group strings by length\n" + input27);
		System.out.println(result27);
		System.out.println("-----------------------------------------------------------------------------");

//		18. Find first non-repeated character
//		Input: "stress"
//		Output: t
		String input28 = "stress";
		char result28 = input28.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
		System.out.println(" Find first non-repeated character\n" + input28);
		System.out.println(result28);

		System.out.println("-----------------------------------------------------------------------------");

//		19. Convert List<Integer> to List<String>
//		Input: [1,2,3]
//		Output: ["1","2","3"]
		List<Integer> input29 = Arrays.asList(1, 2, 3);
		List<String> result29 = input29.stream().map(String::valueOf).toList();
		System.out.println("Convert List<Integer> to List<String>\n" + input29);
		System.out.println(result29);
		System.out.println("-----------------------------------------------------------------------------");

//		20. Count occurrences of each word
//		Input: "java is java and java is fast"
//		Output: {java=3, is=2, and=1, fast=1}
		String input30 = "java is java and java is fast";
		Map<String, Long> result30 = Arrays.stream(input30.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println("Count occurrences of each word\n" + input30);
		System.out.println(result30);

		System.out.println("-----------------------------------------------------------------------------");

//		21. Partition numbers into even and odd
//		Input: [1,2,3,4,5,6]
//		Output: {even=[2,4,6], odd=[1,3,5]}
		List<Integer> input31 = Arrays.asList(1, 2, 3, 4, 5, 6);
		Map<Boolean, List<Integer>> result31 = input31.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
		System.out.println(" Partition numbers into even and odd\n" + input31);
		System.out.println(result31);

		System.out.println("-----------------------------------------------------------------------------");

//		22. Find duplicate elements only
//		Input: [1,2,3,2,4,5,1]
//		Output: [1,2]
		List<Integer> input32 = Arrays.asList(1, 2, 3, 2, 4, 5, 1);
		Set<Integer> result32 = input32.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());

		System.out.println("Find duplicate elements only\n" + input32);
		System.out.println(result32);

		System.out.println("-----------------------------------------------------------------------------");

//		23. Find longest string
//		Input: ["java","microservices","api"]
//		Output: "microservices"
		List<String> input33 = Arrays.asList("java", "microservices", "api");
		String result33 = input33.stream().max(Comparator.comparing(String::length)).get();

		System.out.println(" Find longest string\n" + input33);
		System.out.println(result33);

		System.out.println("-----------------------------------------------------------------------------");

//		24. Find top 3 highest numbers
//		Input: [10,90,30,70,50]
//		Output: [90,70,50]
		List<Integer> input34 = Arrays.asList(10, 90, 30, 70, 50);
		List<Integer> result34 = input34.stream().sorted(Comparator.reverseOrder()).limit(3)
				.collect(Collectors.toList());

		System.out.println(" Find top 3 highest numbers\n" + input34);
		System.out.println(result34);
		System.out.println("-----------------------------------------------------------------------------");
//		25. Flatten list of lists
//		Input: [[1,2],[3,4],[5]]
//		Output: [1,2,3,4,5]
		List<List<Integer>> input35 = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));

		List<Integer> result35 = input35.stream().flatMap(Collection::stream).collect(Collectors.toList());

		System.out.println("Flatten list of lists\n" + input35);
		System.out.println(result35);
		System.out.println("-----------------------------------------------------------------------------");

//		26. Find sum of squares of even numbers
//		Input: [1,2,3,4,5]
//		Output: 20 (2² + 4²)
		List<Integer> input36 = Arrays.asList(1, 2, 3, 4, 5);
		int result36 = input36.stream().filter(n -> n % 2 == 0).map(n -> n * n).reduce(0, Integer::sum);

		System.out.println("Find sum of squares of even numbers\n" + input36);
		System.out.println(result36);
		System.out.println("-----------------------------------------------------------------------------");

//		27. Sort map by value
//		Input: {A=3, B=1, C=2}
//		Output: {B=1, C=2, A=3}
		Map<String, Integer> input37 = new HashMap<>();
		input37.put("A", 3);
		input37.put("B", 1);
		input37.put("C", 2);
		Map<String, Integer> result37 = input37.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("Sort map by value\n" + input37);
		System.out.println(result37);
		System.out.println("-----------------------------------------------------------------------------");

//		28. Find employee with highest salary (using stream)
//		Input: List of Employees
//		Output: Employee object with max salary

		System.out.println("Find employee with highest salary (using stream)\n" + input37);
		System.out.println(result31);
		System.out.println("-----------------------------------------------------------------------------");

//		29. Find common elements between two lists
//		Input: [1,2,3,4] and [3,4,5,6]
//		Output: [3,4]
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(3, 4, 5, 6);
		List<Integer> result39 = list1.stream().filter(list2::contains).collect(Collectors.toList());

		System.out.println("Find common elements between two lists\n" + list1 + " \n and\n " + list2);
		System.out.println(result39);
		System.out.println("-----------------------------------------------------------------------------");

//		30. Find kth smallest element
//		Input: [9,1,5,3,7], k=2
//		Output: 3
		List<Integer> input40 = Arrays.asList(9, 1, 5, 3, 7);
		int k = 2;

		int result40 = input40.stream().sorted().skip(k - 1).findFirst().get();

		System.out.println("Find kth smallest element\n" + input30);
		System.out.println(result40);
	}

}
