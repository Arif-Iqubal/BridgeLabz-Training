package com.constructorandinstance.level1;

//Inheriting the properties of BankAccount class
public class SavingsAccount extends BankAccount {

	SavingsAccount(String accountNumber, String accountHolder, int balance) {
		super(accountNumber, accountHolder, balance);
		
	}

	public static void main(String[] args) {
		//Creating object of Saving Accounts
		SavingsAccount account1 = new SavingsAccount("23848342237","Suraj",7000);
		
		//Accessing public instance
		System.out.println("Assess public instance of parent class \n Account number => " + account1.accountNumber);

		//Accessing protected instance
		System.out.println("Assess protected instance of parent class \n Account number => " + account1.accountHolder);
	}

}
