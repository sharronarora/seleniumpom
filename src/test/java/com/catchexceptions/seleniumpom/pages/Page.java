package com.catchexceptions.seleniumpom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page {
	
	WebDriver driver= null;
	
	public Page(WebDriver driver)
	{
		this.driver=driver;
	}

}
