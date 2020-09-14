package com.qa.crmpro.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.crmpro.pages.HomePage;
import com.qa.crmpro.pages.LoginPage;

public class HomePageTest extends BaseTest {
	@Test
	public void verifyHomepageTitleTest() {
		page.getinstance(LoginPage.class).doLogin("Mayuri_257","mayuri$257");
		String pageTitle=page.getinstance(HomePage.class).getHomePageTitle();
		System.out.println("HomePage login Title"+pageTitle);
	    Assert.assertEquals(pageTitle,"CRMPRO");
	}
	@Test 
	public void verifyHomePageUserNameTest() {
		page.getinstance(LoginPage.class).doLogin("Mayuri_257","mayuri$257");
		driver.switchTo().frame("mainpanel");
		String user=page.getinstance(HomePage.class).getHomePageUserName();
		System.out.println("UserName is: "+user);
		Assert.assertEquals(user, "  User: Mayuri Deshmukh");
		
	}

}
