package com.stream.insuranceclaim;

import java.util.*;
import java.util.stream.Collectors;

// Service class for claim analysis
public class ClaimService {

	// Calculate average claim amount per claim type
	public static Map<String, Double> averageClaimByType(List<Claim> claims) {
		return claims.stream()
				.collect(Collectors.groupingBy(Claim::getType, Collectors.averagingDouble(Claim::getAmount)));
	}
}
