package junit.tutorial.ex03.e02;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AnalyzeExceptionTest {

	@Mock
	private LogLoader logLoader;

	@InjectMocks
	private LogAnalyzer logAnalyzer;

	@DisplayName("Mockを使用して例外処理をthrowし、正しい処理ができているかのテスト")
	@Test
	public void test1() throws IOException {
		Mockito.when(logLoader.load(null)).thenThrow(IOException.class);
		AnalyzeException e = assertThrows(AnalyzeException.class, () -> logAnalyzer.analyze(null));
		e.printStackTrace();
	}

}
