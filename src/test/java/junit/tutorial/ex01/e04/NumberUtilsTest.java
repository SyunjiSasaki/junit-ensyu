package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	NumberUtils num = new NumberUtils();

	@Test
	public void test1() {
		assertTrue(num.isEven(10));
	}

	@Test
	public void test2() {
		assertFalse(num.isEven(7));
	}

}
