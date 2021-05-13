package DataProviderPractice;

import org.testng.annotations.Test;

public class DataProviderExample {
	
	@Test(dataProvider = "ScenarioData" , dataProviderClass = DataProviderSource.class)
	public void Scenario1(String Scenarios){
		
		System.out.println("First Scenario Testing("+Scenarios+")");
	}

	@Test(dataProvider = "ScenarioData" , dataProviderClass = DataProviderSource.class)
	public void Scenario2(String Scenarios){
		
		System.out.println("Second scenario Testing("+Scenarios+")");
	}
	
	@Test(dataProvider = "ScenarioData" , dataProviderClass = DataProviderSource.class)
	public void CommonScenario(String Scenarios){
		
		System.out.println("Common Scenario Testing("+Scenarios+")");
	}
}
