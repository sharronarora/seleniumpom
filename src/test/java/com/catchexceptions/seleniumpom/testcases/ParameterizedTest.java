package com.catchexceptions.seleniumpom.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	
	/*@Parameters("browser")
	@Test*/
	public void parameterizedTest(String browser) {

		if (browser.equals("firefox")) {
			System.out.println("Open Firefox Driver");
		} else if (browser.equals("chrome")) {
			System.out.println("Open Chrome Driver");
		}
	}

}
