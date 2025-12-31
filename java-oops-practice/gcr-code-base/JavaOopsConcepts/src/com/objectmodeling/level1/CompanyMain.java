package com.objectmodeling.level1;
//Create a main class to establish relationship among Company, Department and Employee class instance
public class CompanyMain {
    public static void main(String[] args) {
    	
    	//Create an object of company class
        Company company = new Company("TechSoft");
        
        //Created an object of department class 
        Department itDept = new Department("IT Department");
        itDept.addEmployee("Ravi");
        itDept.addEmployee("Neha");
        
        company.addDepartment(itDept);
        
        //Showing employee details
        itDept.showEmployees();
        company.closeCompany();
    }
}

