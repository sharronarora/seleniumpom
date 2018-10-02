package com.catchexceptions.seleniumpom.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {

	WebDriver driver;
	@BeforeTest
	public void beforeMethod() {

		System.setProperty("WebDriver.gecko.driver", "C://Users//dell//Downloads//geckodriver.exe");
		//driver = new FirefoxDriver();
	}
	
	@Parameters("firefox")
	@BeforeTest
	public void parameterizedTest(String browser) {

		if (browser.equals("firefox")) {
			System.out.println("Open Firefox Driver");
			System.setProperty("WebDriver.gecko.driver", "C://Users//dell//Downloads//geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			System.out.println("Open Chrome Driver");
			//System.setProperty("WebDriver.gecko.driver", "C://Users//dell//Downloads//geckodriver.exe");
			driver =new ChromeDriver();
		}
	}


}
