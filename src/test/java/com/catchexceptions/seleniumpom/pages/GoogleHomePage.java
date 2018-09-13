package com.catchexceptions.seleniumpom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class GoogleHomePage extends Page{
	
	
		public GoogleHomePage(WebDriver driver) {
		super(driver);
		searchBox= driver.findElement(By.id("lst-ib"));
		searchButton= driver.findElement(By.name("btnK"));
		
				// TODO Auto-generated constructor stub
	}
	
	WebElement searchBox;
	WebElement searchButton;
	public WebElement getSearchBox() {
		return searchBox;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}

	

	
	

}
