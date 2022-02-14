package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	Employee employee;
	FileInputStream input;
	File file;

	@BeforeEach
	public void set() {
		employee = new Employee();

		file = new File(
				"C:\\env\\spring-workspace\\junit-ensyu\\src\\main\\java\\junit\\tutorial\\ex02\\e02\\Employee.txt");

		// InputStreamに変換
		try {
			input = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		employee.load(input);
	}

	@DisplayName("FirstNameがIchiroかどうかのテスト")
	@Test
	public void test1() {
		assertEquals("Ichiro", employee.getFirstName(), "FirstNameがIchiro");
	}

	@DisplayName("LastNameがTanakaかどうかのテスト")
	@Test
	public void test2() {
		assertEquals("Tanaka", employee.getLastName(), "LastNameがTanaka");
	}

	@DisplayName("Emailがichiro@example.comかどうかのテスト")
	@Test
	public void test3() {
		assertEquals("ichiro@example.com", employee.getEmail(), "Emailがichiro@example.com");
	}

}
