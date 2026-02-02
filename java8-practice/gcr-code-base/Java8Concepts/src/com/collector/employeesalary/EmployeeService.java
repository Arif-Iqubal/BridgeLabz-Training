package com.collector.employeesalary;

import java.util.*;
import java.util.stream.Collectors;

// Service class for salary categorization
public class EmployeeService {

	// Calculate average salary by department
	public static Map<String, Double> getAverageSalaryByDepartment(List<Employee> employees) {
		return employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
	}
}
