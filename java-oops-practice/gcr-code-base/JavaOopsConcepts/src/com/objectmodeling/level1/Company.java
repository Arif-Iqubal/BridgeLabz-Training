package com.objectmodeling.level1;
//Importing ArrayList form java.util package
import java.util.ArrayList;
import java.util.List;

//Creating a company class
public class Company {
	//private instance of Company class
    private String companyName;
    private List<Department> departments = new ArrayList<>();
    
    //Parameterized constructor
    public Company(String companyName) {
        this.companyName = companyName;
    }
    
    //Public method to add department in list
    public void addDepartment(Department department) {
        departments.add(department);
    }
    
    //Public method to close company
    public void closeCompany() {
        departments.clear();
        System.out.println(companyName + " closed. All departments removed.");
    }
}
