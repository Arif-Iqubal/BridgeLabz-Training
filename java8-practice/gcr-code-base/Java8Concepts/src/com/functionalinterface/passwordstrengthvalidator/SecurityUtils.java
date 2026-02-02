package com.functionalinterface.passwordstrengthvalidator;

//Interface with static utility method
public interface SecurityUtils {

	// Static method to validate password strength
	static boolean isStrongPassword(String password) {
		return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*")
				&& password.matches(".*[0-9].*") && password.matches(".*[@#$%!].*");
	}
}
