package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	NumberUtils num;

	@BeforeEach
	public void instance() {
		num = new NumberUtils();
	}

	@DisplayName("偶数10のときtrueかどうかのテスト")
	@Test
	public void test1() {
		assertTrue(num.isEven(10));
	}

	@DisplayName("奇数7のときfalseかどうかのテスト")
	@Test
	public void test2() {
		assertFalse(num.isEven(7));
	}

}
