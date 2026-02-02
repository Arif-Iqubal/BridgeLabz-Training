package com.stream.logintransaction;

import java.time.LocalDateTime;
import java.util.*;

// Main class for transaction logging
public class TransactionLogger {

	public static void main(String[] args) {

		// List of transaction IDs
		List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003");

		// Logging each transaction with timestamp
		transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + " - Transaction: " + id));
	}
}
