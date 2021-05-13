package DataProviderPractice;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterExample {
	
	@Test(dataProvider = "DoubleSet")
	public void testAddition(int actual, int expected){
		
		int result = actual +20;
		
		Assert.assertEquals(result, expected);
	}
	
	@DataProvider
	public Object[][] getData(){
		return new Object[][]{
				{100,120},
				{200,220},
//				{300,330},
				{400,420}
		};
		}
	
	@DataProvider(name="DoubleSet")
	public Object[][] getDataSample(){
		return new Object[][]{
				{20,40},
				{30,60}
		};
		}
	
	}

