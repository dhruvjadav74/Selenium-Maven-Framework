package com.selenium_maven.qa.testcases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.selenium_maven.qa.base.Base;
import com.selenium_maven.qa.pages.LoginPage;
import io.qameta.allure.Step;


public class LoginTest extends Base {
	
	public LoginTest() {
		super();
	}

	public WebDriver driver;
	LoginPage loginPage;

	@BeforeTest
	public void navigateToBaseUrl() {
		driver = intializeBrowser(prop.getProperty("browser"));
		loginPage = new LoginPage(driver);
	}
	
	@Step("Login Test Case")
	@Test
	public void Checklogin() throws InterruptedException {
		loginPage.enterUsernameAndPassword(prop.getProperty("email"),prop.getProperty("password"));
		loginPage.clickLogin();
		Thread.sleep(2000);
		loginPage.navigateToContactsPageAndCreate();
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}
}	
