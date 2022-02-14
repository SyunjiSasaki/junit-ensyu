package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
;

class StringUtilsTest {

	
	
	@Test
	void test1() {
		String result1 = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa",result1,"aaa→aaa");
	}
	
	@Test
	void test2() {
		String result2 = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world",result2,"HelloWorld→hello_world");
	}
	
	@Test
	void test3() {
		String result3 = StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit",result3,"practiceJunit→practice_junit");
	}
	
}
