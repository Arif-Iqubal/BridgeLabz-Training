package com.regexandjunit.junit.performance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class PerformanceUtilsTest {

	// Fails test if execution exceeds 2 seconds
	@Test
	@Timeout(2)
	void testLongRunningTaskTimeout() throws InterruptedException {
		PerformanceUtils utils = new PerformanceUtils();
		utils.longRunningTask();
	}
}
