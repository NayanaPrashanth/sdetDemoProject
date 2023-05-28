package com.inetBanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseUrl="https://demo.guru99.com/V4/index.php";
	public String username="mngr504521";
	public String password="hYtetym";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver=new FirefoxDriver();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	

}
