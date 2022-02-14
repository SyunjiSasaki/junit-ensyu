package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	Employee employee;
	FileInputStream Input;
	File file;
	List<Employee> list;

	@BeforeEach
	public void set() throws IOException {
		employee = new Employee();
		
		file = new File(
				"C:\\env\\spring-workspace\\junit-ensyu\\src\\main\\java\\junit\\tutorial\\ex02\\e02\\Employee.txt");

		Input = new FileInputStream(file);

		list = employee.load(Input);
	}

	@DisplayName("FirstNameがIchiroかどうかのテスト")
	@Test
	public void test1() {

		assertEquals("Ichiro",list.get(0).getFirstName(), "FirstNameがIchiro");
	}

	@DisplayName("LastNameがTanakaかどうかのテスト")
	@Test
	public void test2() {

		assertEquals("Tanaka", list.get(0).getLastName(), "LastNameがTanaka");
	}

	@DisplayName("Emailがichiro@example.comかどうかのテスト")
	@Test
	public void test3() {

		assertEquals("ichiro@example.com", list.get(0).getEmail(), "Emailがichiro@example.com");
	}

}
