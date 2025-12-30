package com.objectmodeling.level1;
//created a BankMain class
public class BankMain {
    public static void main(String[] args) {
    	//Creating object of Bank class
        Bank bank = new Bank("State Bank");
        
        //Creating object of customer class
        Customer customer = new Customer("Arif", 5000);
        bank.openAccount(customer);
        
        //Accessing methods of customer class
        customer.deposit(2000);
        customer.viewBalance();
    }
}

