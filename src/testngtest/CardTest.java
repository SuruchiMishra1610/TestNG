package testngtest;

import org.testng.annotations.Test;

public class CardTest extends BaseClass{
	
	@Test(groups = {"sanity"},enabled=true,description="this test will validate the CC functionality ")
	public void CCTest() {
		System.out.println("Inside CC Test");
	}

}
