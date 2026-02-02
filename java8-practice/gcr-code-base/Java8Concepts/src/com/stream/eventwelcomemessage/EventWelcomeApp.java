package com.stream.eventwelcomemessage;

import java.util.*;

//Main class for event attendee welcome messages
public class EventWelcomeApp {

	public static void main(String[] args) {

		// List of event attendees
		List<String> attendees = Arrays.asList("Arif", "Sneha", "Rahul", "Kiran");

		// Printing welcome message for each attendee
		attendees.forEach(name -> System.out.println("Welcome to the event, " + name + "!"));
	}
}
