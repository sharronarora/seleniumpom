package com.catchexceptions.seleniumpom.testcases;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SoftAssertionExample {
	
		@Test
		public void softAssert(){
			SoftAssert softAssertion= new SoftAssert();
			System.out.println("softAssert Method Was Started");
			softAssertion.assertTrue(false, null);
			System.out.println("softAssert Method Was Executed");
			softAssertion.assertAll();
		}
		
		@BeforeMethod
		public void hardAssert() {
			
			System.out.println("hardAssert Method Was Started");
			Assert.assertTrue(true);
			System.out.println("hardAssert Method Was Executed");
			//throw new SkipException("Testing skip.");
		}
		
		@Parameters("browser")
		@Test
		public void parameterizedTest(String browser) {
			if (browser.equals("firefox")) {
				System.out.println("Open Firefox Driver in soft assertions");
			} else if (browser.equals("chrome")) {
				System.out.println("Open Chrome Driver");
			}
		}
}
