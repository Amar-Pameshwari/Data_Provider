package DataProviderPractice;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataProviderSource {
	
	
	@DataProvider(name = "TestType")
	
	public static Object[][] getTestTypeData(ITestContext context){
	
		String testCaseName = context.getName();
		System.out.println(testCaseName);
		if("integration".equals(testCaseName)){
			return new Object[][] {{"Integration Test Data"}};
		}
		else if("acceptance".equals(testCaseName)){
			
			return new Object[][] {{"Acceptance Testing Data"}};
		}
		else
		{
			return new Object[][] {{"Common Test Data"}};
		}
	
		
	}

	
	@DataProvider(name="ScenarioData")
	public static Object[][] getScenarioData(Method method){
	
		String testCaseName = method.getName();
		System.out.println(testCaseName);
		if("Scenario1".equals(testCaseName)){
			return new Object[][] {{"Scenario Data"}};
		}
		else if("Scenario2".equals(testCaseName)){
			
			return new Object[][] {{" Scenario Data"}};
		}
		else
		{
			return new Object[][] {{"Common scenario Data"}};
		}
	
		
	}

}
