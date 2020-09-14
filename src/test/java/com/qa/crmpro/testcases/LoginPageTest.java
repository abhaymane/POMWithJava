package com.qa.crmpro.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.crmpro.pages.LoginPage;

public class LoginPageTest extends BaseTest {
	@Test(priority=1)
	public void verifyLoginPageTitleTest() {
		String pageTitle=driver.getTitle();
		System.out.println("Login page Title is: "+pageTitle);
		Assert.assertEquals(pageTitle, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		
	}
	@Test(priority=2)
	public void loginTest() {
		page.getinstance(LoginPage.class).doLogin("Mayuri_257","mayuri$257");
	}

}
