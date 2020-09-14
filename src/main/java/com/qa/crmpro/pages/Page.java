package com.qa.crmpro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	public WebDriver driver;
	public WebDriverWait wait;
	//page class constructor
	public Page(WebDriver driver,WebDriverWait wait) {
		this.driver=driver;
		this.wait=wait;		
	}
	//create method with Java Generic and return new page
	public <Tpage extends BasePage>Tpage getinstance(Class<Tpage>pageClass){
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class,WebDriverWait.class).newInstance(this.driver,this.wait);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
	}
		return null;

	}
}
