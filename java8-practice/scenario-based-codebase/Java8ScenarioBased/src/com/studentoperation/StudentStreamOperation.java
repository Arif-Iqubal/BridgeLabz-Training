package com.studentoperation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentStreamOperation {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(
				new Student(1, "Amit", "Amit Sharma", 20, "Male", "Delhi", 12, "9876543210"),
				new Student(2, "Neha", "Neha Verma", 21, "Female", "Mumbai", 8, "9876543211"),
				new Student(3, "Rahul", "Rahul Mehta", 19, "Male", "Pune", 25, "9876543212"),
				new Student(4, "Priya", "Priya Singh", 29, "Female", "Lucknow", 5, "9876543213"),
				new Student(5, "Arjun", "Arjun Patel", 20, "Male", "Ahmedabad", 18, "9876543214"),
				new Student(6, "Sneha", "Sneha Iyer", 21, "Female", "Chennai", 10, "9876543215"),
				new Student(7, "Vikas", "Vikas Yadav", 27, "Male", "Jaipur", 30, "9876543216"),
				new Student(8, "Ananya", "Ananya Roy", 19, "Female", "Kolkata", 7, "9876543217"),
				new Student(9, "Rohit", "Rohit Kumar", 26, "Male", "Patna", 22, "9876543218"),
				new Student(10, "Kavya", "Kavya Nair", 26, "Female", "Kochi", 14, "9876543219"),

				new Student(11, "Suresh", "Suresh Reddy", 24, "Male", "Hyderabad", 28, "9876543220"),
				new Student(12, "Pooja", "Pooja Jain", 27, "Female", "Indore", 9, "9876543221"),
				new Student(13, "Manish", "Manish Gupta", 22, "Male", "Kanpur", 17, "9876543222"),
				new Student(14, "Riya", "Riya Kapoor", 27, "Female", "Delhi", 6, "9876543223"),
				new Student(15, "Deepak", "Deepak Mishra", 23, "Male", "Bhopal", 26, "9876543224"),
				new Student(16, "Nidhi", "Nidhi Agarwal", 21, "Female", "Noida", 11, "9876543225"),
				new Student(17, "Sanjay", "Sanjay Malhotra", 24, "Male", "Chandigarh", 29, "9876543226"),
				new Student(18, "Isha", "Isha Arora", 19, "Female", "Amritsar", 4, "9876543227"),
				new Student(19, "Kunal", "Kunal Bansal", 27, "Male", "Meerut", 16, "9876543228"),
				new Student(20, "Meera", "Meera Joshi", 20, "Female", "Udaipur", 13, "9876543229"),

				new Student(21, "Aditya", "Aditya Kulkarni", 21, "Male", "Nagpur", 15, "9876543230"),
				new Student(22, "Simran", "Simran Kaur", 22, "Female", "Ludhiana", 3, "9876543231"),
				new Student(23, "Naveen", "Naveen Chandra", 23, "Male", "Bangalore", 21, "9876543232"),
				new Student(24, "Aarti", "Aarti Deshpande", 20, "Female", "Nashik", 19, "9876543233"),
				new Student(25, "Harsh", "Harsh Saxena", 24, "Male", "Bareilly", 27, "9876543234"),
				new Student(26, "Shreya", "Shreya Sen", 21, "Female", "Kolkata", 2, "9876543235"),
				new Student(27, "Mohit", "Mohit Arora", 22, "Male", "Gurgaon", 20, "9876543236"),
				new Student(28, "Tanvi", "Tanvi Kulkarni", 19, "Female", "Satara", 1, "9876543237"),
				new Student(29, "Ramesh", "Ramesh Pawar", 23, "Male", "Solapur", 24, "9876543238"),
				new Student(30, "Alisha", "Alisha Khan", 20, "Female", "Bhopal", 23, "9876543239"));

//	*** Basic Filtering & Mapping
//	1.Print all students whose rank is less than 50.
		System.out.println("Student below rank 50");
		List<String> rankBelow50 = students.stream().filter(x -> x.getRank() < 50).map(x -> x.getName())
				.collect(Collectors.toList());
		System.out.println(rankBelow50);
		System.out.println("---------------------------------------------------");
//	2.Print all students whose age is greater than 25.
		System.out.println("Student whose age is greater than 25");
		List<String> ageGreater25 = students.stream().filter(x -> x.getAge() > 25).map(x -> x.getName())
				.collect(Collectors.toList());
		System.out.println(ageGreater25);
		System.out.println("---------------------------------------------------");
//	3.Print the names of all students only.
		System.out.println("All student name");
		System.out.println(ageGreater25);
		System.out.println("---------------------------------------------------");

//	4.Print all students not from Mumbai.
		System.out.println("Student not from mumbai");
		students.stream().filter(s -> !s.getCity().equalsIgnoreCase("Mumbai")).map(Student::getName)
				.forEach(System.out::println);
		System.out.println("---------------------------------------------------");

//	*** Sorting & Limiting
	// 1. Sort by rank (ascending)
		System.out.println("Sorting rank by ascending order");
		students.stream().sorted(Comparator.comparingInt(Student::getRank))
				.forEach(s -> System.out.println(s.getName() + " : " + s.getRank()));
		System.out.println("---------------------------------------------------");

// 2. Sort by age (descending)
		System.out.println("Sorting rank by descending order");
		students.stream().sorted(Comparator.comparingInt(Student::getAge).reversed())
				.forEach(s -> System.out.println(s.getName() + " : " + s.getAge()));
		System.out.println("---------------------------------------------------");

// 3. Top 5 students by rank
		System.out.println("Top 5 student by rank");
		students.stream().sorted(Comparator.comparingInt(Student::getRank)).limit(5)
				.forEach(s -> System.out.println(s.getName()));
		System.out.println("---------------------------------------------------");

// 4. Last 3 students by rank
		System.out.println("Last 3 student by rank");
		students.stream().sorted(Comparator.comparingInt(Student::getRank).reversed()).limit(3)
				.forEach(s -> System.out.println(s.getName()));
		System.out.println("---------------------------------------------------");

// 5. Sort by name then rank
		System.out.println("Sorting student by name then rank");
		students.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getRank))
				.forEach(s -> System.out.println(s.getName() + " : " + s.getRank()));
		System.out.println("---------------------------------------------------");

//	*** Grouping & Aggregation
//	// 1. Count students by city
		Map<String, Long> cityCount = students.stream()
				.collect(Collectors.groupingBy(Student::getCity, Collectors.counting()));
		System.out.println("Count of student by city");
		System.out.println(cityCount);
		System.out.println("---------------------------------------------------");

		// 2. Average age by gender
		Map<String, Double> avgAgeByGender = students.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
		System.out.println("Average age by gender");
		System.out.println(avgAgeByGender);
		System.out.println("---------------------------------------------------");

		// 3. Average rank by gender
		Map<String, Double> avgRankByGender = students.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getRank)));
		System.out.println("Average Rank by gender");
		System.out.println(avgRankByGender);
		System.out.println("---------------------------------------------------");

		// 4. Third best rank holder
		System.out.println("Third best rank holder");
		students.stream().sorted(Comparator.comparingInt(Student::getRank)).skip(2).findFirst()
				.ifPresent(s -> System.out.println(s.getName()));
		System.out.println("---------------------------------------------------");

		// 5. Youngest student
		System.out.println("Youngest student");
		students.stream().min(Comparator.comparingInt(Student::getAge)).ifPresent(s -> System.out.println(s.getName()));
		System.out.println("---------------------------------------------------");

		// 6. Oldest student
		System.out.println("Oldest student");
		students.stream().max(Comparator.comparingInt(Student::getAge)).ifPresent(s -> System.out.println(s.getName()));
		System.out.println("---------------------------------------------------");

//	**** FlatMap & Collections
		// 1. Print all contact numbers
		System.out.println("All contact numbers");
		students.stream().map(Student::getContacts).forEach(System.out::println);
		System.out.println("---------------------------------------------------");

		// 2. Count contact numbers
		long count = students.stream().map(Student::getContacts).count();
		System.out.println("Count of contact numbers");
		System.out.println(count);
		System.out.println("---------------------------------------------------");

		// 3. Unique contact numbers
		System.out.println("Unique contact numbers");
		students.stream().map(Student::getContacts).distinct().forEach(System.out::println);
		System.out.println("---------------------------------------------------");

		// *** Conditional & Matching
		// 1. Any student from Delhi?
		boolean anyFromDelhi = students.stream().anyMatch(s -> s.getCity().equalsIgnoreCase("Delhi"));
		System.out.println("Any student from delhi");
		System.out.println(anyFromDelhi);
		System.out.println("---------------------------------------------------");

		// 2. All students above age 18?
		boolean allAbove18 = students.stream().allMatch(s -> s.getAge() > 18);
		System.out.println("All Student above 18");
		System.out.println(allAbove18);
		System.out.println("---------------------------------------------------");

		// 3. No student from Goa?
		boolean noneFromGoa = students.stream().noneMatch(s -> s.getCity().equalsIgnoreCase("Goa"));
		System.out.println("No student from Goa?");
		System.out.println(noneFromGoa);
		System.out.println("---------------------------------------------------");

//	*** Gender-Based Analysis
		// 1. Count male & female
		Map<String, Long> genderCount = students.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));
		System.out.println("Count of male and female");
		System.out.println(genderCount);
		System.out.println("---------------------------------------------------");

		// 2. Average age of males
		double avgMaleAge = students.stream().filter(s -> s.getGender().equalsIgnoreCase("Male"))
				.mapToInt(Student::getAge).average().orElse(0);
		System.out.println("Average male age");
		System.out.println(avgMaleAge);
		System.out.println("---------------------------------------------------");

		// 3. Average age of females
		double avgFemaleAge = students.stream().filter(s -> s.getGender().equalsIgnoreCase("Female"))
				.mapToInt(Student::getAge).average().orElse(0);
		System.out.println("Average age of female");
		System.out.println(avgFemaleAge);
		System.out.println("---------------------------------------------------");

		// 4. Highest ranked male
		System.out.println("Higheset Ranked Male");
		students.stream().filter(s -> s.getGender().equalsIgnoreCase("Male"))
				.min(Comparator.comparingInt(Student::getRank)).ifPresent(s -> System.out.println(s.getName()));
		System.out.println("---------------------------------------------------");

		// 5. Highest ranked female
		System.out.println("Highest Female Ranked");
		students.stream().filter(s -> s.getGender().equalsIgnoreCase("Female"))
				.min(Comparator.comparingInt(Student::getRank)).ifPresent(s -> System.out.println(s.getName()));
		System.out.println("---------------------------------------------------");

//	*** Department-Specific Queries
//	1.List students department-wise with names only.
//	2.Find the youngest student in Computer Engineering.
//	3.Find the top-ranked student in Mechanical Engineering.
//	4.Count students in Electronics Engineering from Karnataka.
//	*** Advanced Level
		// 1. Map<Id, Name>
		Map<Integer, String> idNameMap = students.stream().collect(Collectors.toMap(Student::getId, Student::getName));
		System.out.println("Student name mapped with their id");
		System.out.println(idNameMap);
		System.out.println("---------------------------------------------------");

		// 2. Group by city
		Map<String, List<Student>> cityMap = students.stream().collect(Collectors.groupingBy(Student::getCity));
		System.out.println("Group by city");
		System.out.println(cityMap);
		System.out.println("---------------------------------------------------");

		// 3. Name starts with 'S'
		System.out.println("Student name start with letter 'S' ");
		students.stream().filter(s -> s.getName().startsWith("S")).forEach(s -> System.out.println(s.getName()));
		System.out.println("---------------------------------------------------");

		// 4. Name length > 5
		System.out.println("Name length greater than 5");
		students.stream().filter(s -> s.getName().length() > 5).forEach(s -> System.out.println(s.getName()));
		System.out.println("---------------------------------------------------");

		// 5. Rank even
		System.out.println("Student with even rank");
		students.stream().filter(s -> s.getRank() % 2 == 0).forEach(s -> System.out.println(s.getName()));
		System.out.println("---------------------------------------------------");

		// 6. Rank odd
		System.out.println("Student with odd rank");
		students.stream().filter(s -> s.getRank() % 2 != 0).forEach(s -> System.out.println(s.getName()));
		System.out.println("---------------------------------------------------");

//	*** Bonus Challenges
		// 1. Top 3 youngest students
		System.out.println("Top 3 youngest student");
		students.stream().sorted(Comparator.comparingInt(Student::getAge)).limit(3)
				.forEach(s -> System.out.println(s.getName()));

		// 2. Top 3 oldest students
		System.out.println("Top 3 oldest student");
		students.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).limit(3)
				.forEach(s -> System.out.println(s.getName()));
		System.out.println("---------------------------------------------------");

		// 3. Partition by age > 25
		Map<Boolean, List<Student>> agePartition = students.stream()
				.collect(Collectors.partitioningBy(s -> s.getAge() > 25));
		System.out.println("Partition by age greater than 25");
		System.out.println(agePartition);
		System.out.println("---------------------------------------------------");

		// 4. Partition by rank < 100
		Map<Boolean, List<Student>> rankPartition = students.stream()
				.collect(Collectors.partitioningBy(s -> s.getRank() < 100));
		System.out.println("Partition by rank smaller than 100");
		System.out.println(rankPartition);
		System.out.println("---------------------------------------------------");

		// 5. City with maximum students
		System.out.println("City with maximum students");
		cityCount.entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(e -> System.out.println(e.getKey()));
		System.out.println("---------------------------------------------------");

	}

}
