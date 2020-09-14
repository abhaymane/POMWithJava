package com.qa.crmpro.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.crmpro.pages.Page;

public class BaseTest {
	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",".//Driver/chromedriver.exe");
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver,10);
		driver.manage().window().fullscreen();
		driver.get("https://www.crmpro.com/index.html");
		//create the object of page class:instantiate of page class 
		page=new Page(driver,wait);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	

}
