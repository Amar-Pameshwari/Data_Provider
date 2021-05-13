import org.testng.annotations.*;


public class sampleDemo {

	@BeforeSuite
	public void beforeSuiteMethod(){
		System.out.println("Executing before method");
	}
	
	@AfterSuite
	public void afterSuiteMethod(){
		System.out.println("Executing after method");
	}
}
