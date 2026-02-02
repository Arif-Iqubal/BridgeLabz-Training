package com.stream.hospitaldoctor;

import java.util.*;

//Main class
public class HospitalApp {

	public static void main(String[] args) {

		List<Doctor> doctors = Arrays.asList(new Doctor("Dr. Arif", "Cardiology", true),
				new Doctor("Dr. Meera", "Neurology", false), new Doctor("Dr. Rahul", "Orthopedics", true),
				new Doctor("Dr. Sneha", "Dermatology", true));

		// Fetch weekend-available doctors sorted by specialty
		List<Doctor> availableDoctors = DoctorService.getWeekendAvailableDoctors(doctors);

		availableDoctors.forEach(System.out::println);
	}
}
