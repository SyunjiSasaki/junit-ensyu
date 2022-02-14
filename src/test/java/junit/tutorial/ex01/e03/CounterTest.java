package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CounterTest {

	Counter counter = new Counter();

	@Test
	public void test1() {
		int result1 = counter.increment();

		assertEquals(1, result1, "初期状態で呼び出すと１を取得");
	}

	@Test
	public void test2() {
		counter.increment();
		int result2 = counter.increment();

		assertEquals(2, result2, "1回実行した後もう一度実行で2を取得");
	}

	@Test
	public void test3() {
		for (int i = 1; i <= 50; i++) {
			counter.increment();
		}
		int result3 = counter.increment();

		assertEquals(51, result3, "50回実行した後もう一度実行で51を取得");
	}

}
