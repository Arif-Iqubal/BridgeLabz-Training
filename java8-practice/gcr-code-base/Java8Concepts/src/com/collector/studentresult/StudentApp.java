package com.collector.studentresult;

import java.util.*;

//Main class
public class StudentApp {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("Arif", "A"), new Student("Rahul", "B"),
				new Student("Sneha", "A"), new Student("Kiran", "C"), new Student("Meera", "B"));

		// Grouping students by grade
		Map<String, List<String>> groupedStudents = StudentService.groupStudentsByGrade(students);

		// Display result
		groupedStudents.forEach((grade, names) -> System.out.println(grade + " : " + names));
	}
}
