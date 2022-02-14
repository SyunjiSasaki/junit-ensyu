package junit.tutorial.ex02.e01;



import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz FB = new FizzBuzz();
	
	@Test
	public void test1() {
		List<String> result1 = FB.createFizzBuzzList(16);
		List<String> expected = Arrays.asList("1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz,16".split(","));
		
		assertIterableEquals(expected,result1);
	}
}
