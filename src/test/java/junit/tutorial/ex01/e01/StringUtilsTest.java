package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StringUtilsTest {

	@Autowired
	private StringUtils stringUtils;
	
	@Test
	void test1() {
		String result1 = stringUtils.toSnakeCase("aaa");
		assertEquals("aaa",result1,"aaa→aaa");
	}
	
	@Test
	void test2() {
		String result2 = stringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world",result2,"HelloWorld→hello_world");
	}
	
	@Test
	void test3() {
		String result3 = stringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit",result3,"practiceJunit→practice_junit");
	}
	
}
