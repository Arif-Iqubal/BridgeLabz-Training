package com.functionalinterface.dataserialization;

//Main class to test backup processing
public class BackupApp {

	public static void main(String[] args) {

		UserData user = new UserData("Arif");
		TransactionData txn = new TransactionData("TXN101");
		String normalData = "Not for backup";

		BackupProcessor.processBackup(user);
		BackupProcessor.processBackup(txn);
		BackupProcessor.processBackup(normalData);
	}
}
