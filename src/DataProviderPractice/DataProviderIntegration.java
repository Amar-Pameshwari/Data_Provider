package DataProviderPractice;

import org.testng.annotations.Test;

public class DataProviderIntegration {

	@Test(dataProvider = "TestType", dataProviderClass = DataProviderSource.class)
	
	public void integration(String Data){
		
		System.out.println("Integration Scenario Testing("+Data+")");
	}

}
