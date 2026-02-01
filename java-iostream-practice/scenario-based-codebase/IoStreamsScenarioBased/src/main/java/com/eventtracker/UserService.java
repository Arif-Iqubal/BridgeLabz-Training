package com.eventtracker;

public class UserService {

	@AuditTrail(action = "LOGIN", description = "User logged into the system")
	public void loginUser() {
	}

	@AuditTrail(action = "UPLOAD", description = "User uploaded a file")
	public void uploadFile() {
	}

	@AuditTrail(action = "DELETE", description = "User deleted a file")
	public void deleteFile() {
	}

	// Not audited
	public void viewProfile() {
	}
}
