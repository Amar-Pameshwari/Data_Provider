package AssessrtionPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestParameter {
	
	@Test
	@Parameters("browser")
	public void testCaseOne(String browser){
		
		System.out.println("Browser:"+browser);
	}

	@Test
	@Parameters({"userName","Password"})
	public void testCaseTwo(String userName, String Password){
		
		System.out.println("Username:"+userName);
		System.out.println("Password:"+Password);
	}

}
