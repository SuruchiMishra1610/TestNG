package testngtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	
	@BeforeTest(alwaysRun=true)
	public void method3() {
		
		System.out.println("Insdie Before Test method3");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void method1() {
		System.out.println("Inside Before method1");
	}

	@AfterMethod(alwaysRun=true)
	public void method2() {
		
		System.out.println("Inside After Method2");
	
    }
	@AfterTest(alwaysRun=true)
	public void method4() {
		
		System.out.println("Inside After Test Method4");
	}

}
