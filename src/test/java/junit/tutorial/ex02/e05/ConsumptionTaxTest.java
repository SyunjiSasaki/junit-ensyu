package junit.tutorial.ex02.e05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ConsumptionTaxTest {

	ConsumptionTax cons;

	@DisplayName("CsvSourceを使ったパラメータテスト")
	@ParameterizedTest
	@CsvSource({ "5,100,105", "5,3000,3150", "10,50,55", "5,50,52", "3,50,51" })
	public void test1(int tax, int price, int expected) {
		
		cons = new ConsumptionTax(tax);
		int acctual = cons.apply(price);
		
		assertEquals(expected, acctual);
	}
}
