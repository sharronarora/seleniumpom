package com.catchexceptions.seleniumpom.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.catchexceptions.seleniumpom.pages.GoogleHomePage;
import com.catchexceptions.seleniumpom.pages.GoogleHomePageAnnotated;

public class GoogleHomePageTest extends BaseClass {

	@Test 	
	public void testGoogleSearch() {
	/*	this.driver.manage().window().maximize();
		this.driver.get("https://google.com");
		GoogleHomePage googleHomePage = new GoogleHomePage(driver);
		googleHomePage.getSearchBox().sendKeys("Home");
		Actions actions = new Actions(driver);
		actions.click(googleHomePage.getSearchButton());
		*/
		System.out.println("Test Case 1 with priority 2 ");
		//driver.quit();
	}

	@Test
	public void testGoogleSearchAnnotated() {
		/*this.driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		this.driver.get("https://google.com");
		GoogleHomePageAnnotated googleHomePageAnnotated = PageFactory.initElements(driver, GoogleHomePageAnnotated.class);
		googleHomePageAnnotated.getSearchBox().sendKeys("Home");
		
		// to send keys tab
		
		googleHomePageAnnotated.getSearchBox().sendKeys(Keys.TAB);
		Actions actions = new Actions(driver);
		actions.click(googleHomePageAnnotated.getSearchButton());
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.print(size);
		System.out.println(size);*/
		System.out.println("Test Case 2 with priority 2 and depends on 1");
		//driver.close();
	}
	
}
