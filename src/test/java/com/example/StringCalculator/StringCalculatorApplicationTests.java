package com.example.StringCalculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class StringCalculatorApplicationTests {

	@Test
	void testEmptyStringReturnsZero() {
		StringCalculator calc = new StringCalculator();
		assertEquals(0, calc.Add(""), "Empty string should return 0");
	}
	@Test
	void testSingleNumberReturnsValue() {
		StringCalculator calc = new StringCalculator();
		assertEquals(1, calc.Add("1"));
		assertEquals(5, calc.Add("5"));
	}
	@Test
	void testTwoNumbersReturnSum() {
		StringCalculator calc = new StringCalculator();
		assertEquals(3, calc.Add("1,2"));
		assertEquals(7, calc.Add("3,4"));
	}
	
	@Test
	void testMultipleNumbersReturnSum() {
    StringCalculator calc = new StringCalculator();
    assertEquals(6, calc.Add("1,2,3"));
    assertEquals(10, calc.Add("1,2,3,4"));
}
	@Test
	void testNewLineAsDelimiter() {
		StringCalculator calc = new StringCalculator();
		assertEquals(6, calc.Add("1\n2,3"));
	}

	@Test
	void testCustomDelimiter() {
		StringCalculator calc = new StringCalculator();
		assertEquals(3, calc.Add("//;\n1;2"));
	}

	@Test
	void testNegativeNumbersThrowException() {
    StringCalculator calc = new StringCalculator();
    Exception ex = assertThrows(IllegalArgumentException.class, () -> {
        calc.Add("1,-2,3,-4");
    });
    assertEquals("negatives not allowed: -2,-4", ex.getMessage());
}


}
