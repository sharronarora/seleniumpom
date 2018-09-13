package com.catchexceptions.seleniumpom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleHomePageAnnotated extends Page {

	public GoogleHomePageAnnotated(WebDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}
	@FindBy(how =How.ID, using="lst-ib")
	WebElement searchBox;
	
	@FindBy(how =How.NAME, using="btnK")
	WebElement searchButton;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

}
