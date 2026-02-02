package com.stream.emailnotification;

import java.util.*;

//Main class for email notifications
public class EmailNotificationApp {

	public static void main(String[] args) {

		// List of user emails
		List<String> emails = Arrays.asList("user1@example.com", "user2@example.com", "user3@example.com");

		// Sending notification to each email using forEach
		emails.forEach(email -> sendEmailNotification(email));
	}

	// Method to simulate sending email
	private static void sendEmailNotification(String email) {
		System.out.println("Notification email sent to: " + email);
	}
}
