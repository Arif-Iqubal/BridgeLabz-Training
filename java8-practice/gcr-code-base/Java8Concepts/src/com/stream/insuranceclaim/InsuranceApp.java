package com.stream.insuranceclaim;

import java.util.*;

//Main class
public class InsuranceApp {

	public static void main(String[] args) {

		List<Claim> claims = Arrays.asList(new Claim("Health", 50000), new Claim("Health", 70000),
				new Claim("Vehicle", 30000), new Claim("Vehicle", 45000), new Claim("Life", 100000));

		// Get average claim amount per type
		Map<String, Double> averageClaims = ClaimService.averageClaimByType(claims);

		// Display result
		averageClaims.forEach((type, avg) -> System.out.println(type + " Average Claim: " + avg));
	}
}
