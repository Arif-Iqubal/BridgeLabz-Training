package com.functionalinterface.sensitivedatatagging;

//Main class to test sensitive data tagging
public class SecurityApp {

	public static void main(String[] args) {

		CustomerCredentials credentials = new CustomerCredentials("user01", "pass@123");

		ProductInfo product = new ProductInfo("Laptop");

		EncryptionProcessor.encryptIfSensitive(credentials);
		EncryptionProcessor.encryptIfSensitive(product);
	}
}
