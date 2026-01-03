package MyBank;

//main class
public class MyBank {

	public static void main(String[] args) {
		
		//Creating Saving and Current account
		System.out.println("-------------------");
		Account account1 = new SavingAccount(15.5,1000);
		System.out.println("-------------------");
		Account account2 = new CurrentAccount(5);
		System.out.println("-------------------");
		
		//Checking balance of current and saving account
		account1.checkBalance();
		account2.checkBalance();
		
		//Depositing amount in saving and current account
		System.out.println("-------------------");
		account1.deposite(1000);
		account2.deposite(1000);
		
		//Checking balance after depositing amount
		System.out.println("-------------------");
		account1.checkBalance();
		account2.checkBalance();
		
		//Withdrawing amount from saving and current account
		System.out.println("-------------------");
		account2.withdraw(500);
		account1.withdraw(1000);
		account2.withdraw(1000);
		
		//Checking account balance
		System.out.println("-------------------");
		account1.checkBalance();
		account2.checkBalance();

	}

}
