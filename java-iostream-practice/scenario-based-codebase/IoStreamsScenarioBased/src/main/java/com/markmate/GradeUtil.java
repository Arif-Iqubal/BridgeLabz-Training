package com.markmate;

public class GradeUtil {

	public static String calculateGrade(double avg) {
		if (avg >= 90)
			return "A+";
		if (avg >= 80)
			return "A";
		if (avg >= 70)
			return "B";
		if (avg >= 60)
			return "C";
		return "Fail";
	}
}
