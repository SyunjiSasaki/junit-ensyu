package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator cal = new Calculator();

	@Test
	public void test1() {
		try {
			cal.divide(2, 0);
			fail();
		} catch (IllegalArgumentException e) {
			assertTrue(e.getMessage().matches("divide by zero."));
		}

	}

}
