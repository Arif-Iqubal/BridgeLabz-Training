package com.stream.filterexpiringmember;

import java.time.LocalDate;
import java.util.*;

// Main class
public class GymApp {

	public static void main(String[] args) {

		List<Member> members = Arrays.asList(new Member("Arif", LocalDate.now().plusDays(10)),
				new Member("Rahul", LocalDate.now().plusDays(45)), new Member("Sneha", LocalDate.now().plusDays(25)),
				new Member("Kiran", LocalDate.now().minusDays(5)));

		// Get members whose membership expires in next 30 days
		List<Member> expiringMembers = MembershipService.getExpiringMembers(members);

		expiringMembers.forEach(System.out::println);
	}
}
