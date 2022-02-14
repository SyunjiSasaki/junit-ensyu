package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StringUtilsTest {

	@Autowired
	private StringUtils stringUtils;
	
	@Test
	void test1() {
		String result1;
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
