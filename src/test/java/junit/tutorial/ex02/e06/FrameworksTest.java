package junit.tutorial.ex02.e06;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FrameworksTest {

	Frameworks fm ;
	
	@DisplayName("Trueテスト")
	@ParameterizedTest
	@CsvSource({ "GlassFish,Oracle", "GlassFish,DB2","GlassFish,PostgreSQL","GlassFish,MySQL","JBoss,DB2","JBoss,PostgreSQL","Tomcat,MySQL" })
	public void test1(ApplicationServer app, Database db) { 
		assertTrue(fm.isSupport(app, db));
	}
	
	@DisplayName("Falseテスト")
	@ParameterizedTest
	@CsvSource({ "JBoss,Oracle","JBoss,MySQL","Tomcat,Oracle","Tomcat,DB2","Tomcat,PostgreSQL"})
	public void test2(ApplicationServer app, Database db) { 
		assertFalse(fm.isSupport(app, db));
	}
	
	

}
