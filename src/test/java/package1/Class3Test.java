package package1;

import org.testng.annotations.Test;

import genericUtils.BaseClass;

public class Class3Test extends BaseClass {
	
	
	@Test(groups = {"smoke","regression"})
	public void method1() {
		System.out.println("Class 3 method 1");
	}
	
	@Test
	public void method2() {
		System.out.println("Class 3 method 2");
	}
	
	@Test(groups = {"smoke","regression"}) 
	public void method3() {
		System.out.println("Class 3 method 3");
	}
}
