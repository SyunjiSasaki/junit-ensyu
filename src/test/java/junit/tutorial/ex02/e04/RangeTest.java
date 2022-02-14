package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RangeTest {

	Range range;

	@DisplayName("min=0.0,max=10.5のRangeの時の各テスト")
	@Test
	public void test1() {
		range = new Range(0.0, 10.5);

		assertFalse(range.contains(-0.1));

		assertTrue(range.contains(0.0));

		assertTrue(range.contains(10.5));

		assertFalse(range.contains(10.6));

	}
	
	@DisplayName("min=-5.1,max=5.1のRangeの時の各テスト")
	@Test
	public void test2() {
		range = new Range(-5.1, 5.1);

		assertFalse(range.contains(-5.2));

		assertTrue(range.contains(-5.1));

		assertTrue(range.contains(5.1));

		assertFalse(range.contains(5.2));

	}

}
