package com.functionalinterface.sensitivedatatagging;

//Class containing sensitive information
public class CustomerCredentials implements SensitiveData {

	private String username;
	private String password;

	public CustomerCredentials(String username, String password) {
		this.username = username;
		this.password = password;
	}
}
