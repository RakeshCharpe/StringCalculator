package com.example.StringCalculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StringCalculatorApplicationTests {

	@Test
	void testEmptyStringReturnsZero() {
		StringCalculator calc = new StringCalculator();
		assertEquals(0, calc.Add(""), "Empty string should return 0");
	}
}
