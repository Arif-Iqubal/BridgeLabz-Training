package com.functionalinterface.sensitivedatatagging;

//Encryption processor checks marker interface
public class EncryptionProcessor {

	public static void encryptIfSensitive(Object obj) {

		if (obj instanceof SensitiveData) {
			System.out.println("Encrypting sensitive data: " + obj.getClass().getSimpleName());
		} else {
			System.out.println("No encryption required");
		}
	}
}
