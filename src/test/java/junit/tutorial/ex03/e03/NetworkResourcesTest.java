package junit.tutorial.ex03.e03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class NetworkResourcesTest {

	@Mock
	NetworkLoader networkLoader;
	
	@InjectMocks
	NetworkResources networkResources;
	
	@DisplayName("NetworkLoaderが「Hello World」を返すInputStreamを返すとき、NetworkResourcesのloadメソッドは「Hello World」を返すテスト")
	@Test
	public void test1() throws IOException {
		
		String a = "Hello World";
		InputStream hello  = new ByteArrayInputStream(a.getBytes("utf-8"));
		
		Mockito.when(networkLoader.getInput()).thenReturn(hello);
		assertEquals("Hello World",networkResources.load());
	}
	

}
