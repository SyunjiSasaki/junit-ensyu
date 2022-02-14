package junit.tutorial.ex03.e05;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HelloServletTest {
	
	@Mock
	private HttpServletRequest request;

	@Mock
	private HttpServletResponse response;
	
	@Mock
	private ServletOutputStream stream;
	
	@InjectMocks
	private HelloServlet helloServlet = new HelloServlet();


	@DisplayName("サーブレットのテスト")
	@Test
	public void test() throws Exception  {
		
			doReturn("JUnit").when(request).getParameter("name");
			doReturn(stream).when(response).getOutputStream();
			helloServlet.doGet(request, response);
			verify(response.getOutputStream()).println("Hello JUnit");
			
			verify(response).setContentType("text/plain; charset=UTF-8");
			verify(response, times(1)).flushBuffer();
		}

		
		/*HelloServlet helloServlet  = new HelloServlet();
		
		MockHttpServletRequest req = new MockHttpServletRequest();
        MockHttpServletResponse resp = new MockHttpServletResponse();
        
       req.setParameter("name", "JUnit");
       
       try {
    	   helloServlet.doGet(req, resp);
       }catch(Exception e) {
    	   e.printStackTrace();
       }
       
       assertEquals("Hello JUnit",req.getParameter("name")); */
	}

