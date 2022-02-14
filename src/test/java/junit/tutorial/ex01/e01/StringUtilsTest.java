package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	
	@DisplayName("aaa→aaaに変換されるかのテスト")
	@Test
	void test1() {
		String result1 = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa",result1,"aaa→aaa");
	}
	
	@DisplayName("HelloWorld→hello_worldに変換されるかのテスト")
	@Test
	void test2() {
		String result2 = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world",result2,"HelloWorld→hello_world");
	}
	
	@DisplayName("practiceJunit→practice_junitに変換されるかのテスト")
	@Test
	void test3() {
		String result3 = StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit",result3,"practiceJunit→practice_junit");
	}
	
}
