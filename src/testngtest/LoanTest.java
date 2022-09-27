package testngtest;

import org.testng.annotations.Test;
@Test(groups = {"sanity"})
public class LoanTest extends BaseClass{


	public void HomeLoanTest() {
		
		System.out.println("Inside home Loan test");
	}
	@Test(enabled=false)
	public void PersonlLoanTest() {
		
		System.out.println("Inside Personal Loan test");
	}
	
	@Test(priority=0)
	public void PersonlLoanTest1() {
		
		System.out.println("Inside Personal Loan test1");
	}
	
}