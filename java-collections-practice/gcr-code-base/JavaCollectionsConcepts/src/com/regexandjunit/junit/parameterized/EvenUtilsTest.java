package com.regexandjunit.junit.parameterized;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class EvenUtilsTest {

	// Tests isEven method with multiple input values
	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 6, 7, 9 })
	void testIsEven(int number) {
		EvenUtils evenUtils = new EvenUtils();

		if (number % 2 == 0) {
			assertTrue(evenUtils.isEven(number));
		} else {
			assertFalse(evenUtils.isEven(number));
		}
	}
}
