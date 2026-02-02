package com.functionalinterface.dateformat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Interface with static date formatting utility
public interface DateFormatUtil {

	// Format date using given pattern
	static String formatDate(LocalDate date, String pattern) {
		return date.format(DateTimeFormatter.ofPattern(pattern));
	}
}
