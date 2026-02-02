package com.collector.studentresult;

import java.util.*;
import java.util.stream.Collectors;

// Service class for student grouping
public class StudentService {

	// Group students by grade and collect names
	public static Map<String, List<String>> groupStudentsByGrade(List<Student> students) {
		return students.stream().collect(Collectors.groupingBy(Student::getGrade, // group by grade
				Collectors.mapping(Student::getName, // collect names
						Collectors.toList())));
	}
}
