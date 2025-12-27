package com.constructorandinstance.level1;

public class BankAccount {
	public String accountNumber;
	protected String accountHolder;
	private int balance;
	
	//Parameterized constructor
	BankAccount(String accountNumber, String accountHolder, int balance){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	//Set private value using setter method
	public void setBalance(int balance) {
		this.balance = balance;
	}
	//Getting details of bank balance using getter method
	public void getBalance(){
		System.out.println("Balance => " + this.balance);
	}
	
	public void displayDetails() {
		System.out.println("Account number => " + accountNumber);
		System.out.println("Account holder => " + accountHolder);
		System.out.println("Balance => " + balance);
	}
	public static void main(String[] args) {
		// Creating object of class 
		BankAccount account1 = new BankAccount("23848342237","Suraj",7000);
		account1.displayDetails();
		account1.setBalance(8000);
		account1.getBalance();
		account1.displayDetails();
		
	}

}

