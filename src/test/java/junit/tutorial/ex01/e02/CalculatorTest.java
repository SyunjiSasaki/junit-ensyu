package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	
	Calculator cal ;
	
	@BeforeEach
	public void insatnce() {
		cal = new Calculator();
	}
	
	@DisplayName("例外が発生し、そのメッセージが一致するかのテスト")
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
