package com.functionalinterface.passwordstrengthvalidator;

//Main class to test password validation
public class InsurancePortalApp {

	public static void main(String[] args) {

		String password = "Secure@123";

		if (SecurityUtils.isStrongPassword(password)) {
			System.out.println("Password is strong");
		} else {
			System.out.println("Password is weak");
		}
	}
}
