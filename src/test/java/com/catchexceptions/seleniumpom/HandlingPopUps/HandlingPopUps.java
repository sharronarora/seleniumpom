package com.catchexceptions.seleniumpom.HandlingPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HandlingPopUps {
    WebDriver driver;

    //Web Elements defined

    @Parameters("browser")
    @BeforeTest
    public void createConnection(String browser) {

        if (browser.equals("firefox")) {
            System.out.println("Open Firefox Driver");
            //System.setProperty("WebDriver.gecko.driver", "C://Users//dell//Downloads//geckodriver.exe");
            System.setProperty("WebDriver.gecko.driver", "/usr/local/bin/geckodriver");
            driver = new FirefoxDriver();

            /*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette",true);
            driver= new FirefoxDriver(capabilities);
            System.out.println(driver + "FF invoked");*/

            System.out.println(driver + "FF invoked");
        } else if (browser.equals("chrome")) {
            System.out.println("Open Chrome Driver");
            //System.setProperty("WebDriver.chrome.driver", "C://Users//dell//Downloads//chromedriver.exe");
            System.setProperty("WebDriver.chrome.driver", "/usr/bin/chromedriver");
            driver = new ChromeDriver();
        }
    }

    @Test(priority = 1)
    public void RedirectToURL() {
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        System.out.println("Redirection");
    }

    @Test(priority = 2)
    @Parameters("CustomerID")
    public void DeleteCustomer(int CustomerID) throws InterruptedException {
        //WebElement customerIDTextBox = driver.findElement(By.xpath("//input[@name='cusid'"));
        //WebElement buttonSubmit = driver.findElement(By.xpath("//input[@name='submit']"));
        //WebElement buttonCancel = driver.findElement(By.xpath("//input[@name='res']"));
        WebElement customerIDTextBox = driver.findElement(By.name("cusid"));
        WebElement buttonSubmit = driver.findElement(By.name("submit"));
        WebElement buttonCancel = driver.findElement(By.name("res"));

        customerIDTextBox.sendKeys("CustomerID");
        buttonSubmit.click();
        Alert alert = driver.switchTo().alert();
        // Capturing alert message.    
        String alertMessage = alert.getText();
        // Displaying alert message		
        System.out.println(alertMessage);
        alert.dismiss();
        System.out.println("Alert Dismissed");
        
        Thread.sleep(5000);
        
        customerIDTextBox.sendKeys("CustomerID");
        buttonSubmit.click();
        alert = driver.switchTo().alert();
        // Capturing alert message.    
        alertMessage = alert.getText();
        // Displaying alert message		
        System.out.println(alertMessage);
        alert.accept();
        System.out.println("Alert Accepted");
        
        driver.quit();
    }
}
