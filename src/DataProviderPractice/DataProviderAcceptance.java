package DataProviderPractice;

import org.testng.annotations.Test;

public class DataProviderAcceptance {

	@Test(dataProvider = "TestType", dataProviderClass = DataProviderSource.class)
	
	public void acceptance(String Data){
		System.out.println("Acceptance Scenario Testing("+Data+")");
	}

}
