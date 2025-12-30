package com.objectmodeling.level1;
//Create a bank class
public class Bank {
	//Private instance of bank class
    private String bankName;
    
    
    public Bank(String bankName) {
        this.bankName = bankName;
    }
    
    //Method to open account
    public void openAccount(Customer customer) {
        System.out.println("Account opened for " + customer.getName() + " in " + bankName);
    }
}
