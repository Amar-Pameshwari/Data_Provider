import org.testng.annotations.*;


public class facebookLogin {

	@Test
	public void withvalidCredentials(){
		System.out.println("Hi, I am successful Login");
	}
	
	@Test
	public void withInvalidCredentials(){
		System.out.println("Hi, I am not successful Login");	
	}
	
	@Test
	public void withInvalidUsername(){
		System.out.println("Hi, I am not successful Login");
	}
	
	
}
