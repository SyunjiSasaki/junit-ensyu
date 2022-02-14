package junit.tutorial.ex03.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MonthlyCalendarTest {

	MonthlyCalendar month;
	
	@DisplayName("各現在時刻ごとのテスト")
	@ParameterizedTest
	@CsvSource({"2012/01/31,0","2012/01/30,1","2012/02/01,28"})
	public void test1(String date,int expected) {
		LocalDate d =LocalDate.parse(date,DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		month = new MonthlyCalendar(d);
		assertEquals(expected,month.getRemainingDays());
	}

}
