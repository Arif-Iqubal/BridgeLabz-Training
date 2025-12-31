package com.objectmodeling.level1;

//Importing ArrayList from java.util package
import java.util.ArrayList;
import java.util.List;

public class Department {
	//Private instance of Department class
    private String departmentName;
    private List<Employee> employees = new ArrayList<>();
    
    //Parameterized constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
    
    //Public method to add employee
    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }
    
    //Public method to show employee details
    public void showEmployees() {
        System.out.println("Employees in " + departmentName + ":");
        for (Employee emp : employees) {
            System.out.println("- " + emp.getEmployeeName());
        }
    }
}
