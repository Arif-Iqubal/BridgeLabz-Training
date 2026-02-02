package com.functionalinterface.dataserialization;

//User data class marked for backup
public class UserData implements BackupSerializable {

	private String username;

	public UserData(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}
}
