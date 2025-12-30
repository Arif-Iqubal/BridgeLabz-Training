package com.objectmodeling.level1;
//Create a class Customer
public class Customer {
	//Private instance of customer class
    private String name;
    private double balance;
    
    //Parameterized constructor
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    
    //Method to access private instance
    
    public void viewBalance() {
        System.out.println(name + "'s balance: ₹" + balance);
    }
    
    
    public void deposit(double amount) {
        balance += amount;
    }
    public String getName() {
    	return this.name;
    }
}

