package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {

	Range range;
	
	@DisplayName("min=0.0,max=10.5のRangeの時のTrueテスト")
	@ParameterizedTest
	@ValueSource(doubles= {0.0,10.5})
	public void test1(double n) {
		range = new Range(0.0, 10.5);

		assertTrue(range.contains(n));

	}

	@DisplayName("min=0.0,max=10.5のRangeの時のFalseテスト")
	@ParameterizedTest
	@ValueSource(doubles= {-0.1,10.6})
	public void test2(double n) {
		range = new Range(0.0, 10.5);

		assertFalse(range.contains(n));

	}
	
	
	
	@DisplayName("min=-5.1,max=5.1のRangeの時のTrueテスト")
	@ParameterizedTest
	@ValueSource(doubles= {-5.1,5.1})
	public void test3(double n) {
		range = new Range(-5.1, 5.1);

		assertTrue(range.contains(n));

	}


	@DisplayName("min=-5.1,max=5.1のRangeの時のFalseテスト")
	@ParameterizedTest
	@ValueSource(doubles= {-5.2,5.2})
	public void test4(double n) {
		range = new Range(-5.1, 5.1);

		assertFalse(range.contains(n));

	}

}
