package com.selenium_maven.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium_maven.qa.pages.LoginPage;
import com.selenium_maven.qa.base.Base;

public class LoginTest extends Base {
	

	public LoginTest() {
		super();
	}

	public WebDriver driver;
	LoginPage loginPage;

	@BeforeClass
	public void navigateToBaseUrl() {
		driver = intializeBrowser(prop.getProperty("browser"));
		loginPage = new LoginPage(driver);
	}
	
	@Test
	public void Checklogin() throws InterruptedException {
		loginPage.enterUsernameAndPassword();
		loginPage.clickLogin();
		Thread.sleep(2000);
		loginPage.navigateToContactsPageAndCreate();
		Thread.sleep(2000);
	}
	
	@Test
	public void enterContactDetails() {
		
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
}	
