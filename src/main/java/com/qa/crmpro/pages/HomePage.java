package com.qa.crmpro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	//locator
	
	By userName = By.xpath("//td[contains(text(),'User: Mayuri Deshmukh')]");
	
	//HomePage Actions
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public String getHomePageUserName() {
		return dogetText(userName);
		
		
	}

}
