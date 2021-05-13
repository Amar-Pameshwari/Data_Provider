package executionOrder;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class sampleTestngUsage {

	
	@BeforeTest
	public void beforeTest(){
		
		System.out.println("From BeforeTest annotation in SampleTestngUsage class ..");
	}
	
	@BeforeSuite(enabled=false)
	public void beforeSuite() {
		System.out.println("From BeforeSuite annotation in SampleTestngUsage class ..");
	}

}
