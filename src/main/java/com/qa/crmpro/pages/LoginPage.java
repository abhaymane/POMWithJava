package com.qa.crmpro.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	//LoginPage locator
	By userName=By.name("username");
	By userPass=By.name("password");
	By loginBtn=By.xpath("//input[@type='submit']");
	
	//page actions:
	public String getLoginPageTitle() {
		return driver.getTitle();
		
	}
	public void doLogin(String user,String pwd) {
		doSendKeys(userName,user);
		doSendKeys(userPass,pwd);
		doClick(loginBtn);
	}

}
