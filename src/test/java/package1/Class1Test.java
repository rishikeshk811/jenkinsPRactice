package package1;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genericUtils.BaseClass;

public class Class1Test extends BaseClass {

	@Test(groups = "smoke")
	public void method1() {
		System.out.println("Class 1 method 1");
	}
	
	
	
	@Parameters({"name"})
	@Test(groups = "smoke")
	public void method2(@Optional("Rahul Singh")  String Name) {
		System.out.println("Class 1 method 2"+Name);
	}
	
	@Test(groups = "regression")
	public void method3() {
		System.out.println("Class 1 method 3");
	}
	
}
