package com.inetBanking.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageobject.loginPage;

public class TC_loginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() {
		driver.get(baseUrl);
		
		loginPage lp=new loginPage(driver);
		
		lp.SetUserName(username);
		lp.SetPassword(password);
		lp.ClickloginButton();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
	}
		
	

}
