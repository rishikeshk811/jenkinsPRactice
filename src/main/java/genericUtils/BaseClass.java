package genericUtils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseClass {

	
	
	
	
	
	
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		System.out.println("Launching Browser in "+browserName);
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
	
		System.out.println("before Method ");
	}
	
	
	
	@AfterMethod
        public void AfterMethod() {
		System.out.println("After Method ");
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Closing the  Browser ");
	}
	
	
}
