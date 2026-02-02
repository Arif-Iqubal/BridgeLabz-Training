package com.functionalinterface.dataserialization;

//Transaction data class marked for backup
public class TransactionData implements BackupSerializable {

	private String transactionId;

	public TransactionData(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionId() {
		return transactionId;
	}
}
