package package1;

import org.testng.annotations.Test;

import genericUtils.BaseClass;

public class Class2Test  extends BaseClass {
	
	@Test(groups = "smoke")
	public void method1() {
		System.out.println("Class 2 method 1");
	}
	
	@Test
	public void method2() {
		System.out.println("Class 2 method 2");
	}
	
	@Test(groups = "regression")
	public void method3() {
		System.out.println("Class 2 method 3");
	}
}
