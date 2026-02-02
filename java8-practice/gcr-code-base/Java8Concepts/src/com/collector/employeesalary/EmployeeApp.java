package com.collector.employeesalary;

import java.util.*;

//Main class
public class EmployeeApp {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Arif", "IT", 60000), new Employee("Rahul", "IT", 70000),
				new Employee("Sneha", "HR", 50000), new Employee("Kiran", "HR", 55000),
				new Employee("Meera", "Finance", 65000));

		// Average salary per department
		Map<String, Double> avgSalaryByDept = EmployeeService.getAverageSalaryByDepartment(employees);

		// Display result
		avgSalaryByDept.forEach((dept, avgSalary) -> System.out.println(dept + " Average Salary: ₹" + avgSalary));
	}
}
