package com.stream.hospitaldoctor;

import java.util.*;
import java.util.stream.Collectors;

// Service class for doctor filtering and sorting
public class DoctorService {

	public static List<Doctor> getWeekendAvailableDoctors(List<Doctor> doctors) {
		return doctors.stream().filter(Doctor::isAvailableOnWeekend) // weekend availability
				.sorted(Comparator.comparing(Doctor::getSpecialty)) // sort by specialty
				.collect(Collectors.toList());
	}
}
