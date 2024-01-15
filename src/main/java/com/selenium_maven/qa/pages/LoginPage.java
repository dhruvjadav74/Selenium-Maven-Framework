package com.selenium_maven.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	By uname = By.cssSelector("input[placeholder='Email']");
	By pswd = By.cssSelector("input[placeholder='Password']");
	By loginbtn = By.xpath("//div[text()='Login']");
	By contactsbtn = By.xpath("//i[@class='users icon']");
	By createcontact = By.xpath("//button[text()='Create']");
	By firstname = By.xpath("//input[@name='first_name']");
	By lastname = By.xpath("//input[@name='last_name']");
	By middlename = By.xpath("//input[@name='middle_name']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUsernameAndPassword(String email,String password) throws InterruptedException {
		Thread.sleep(2000);
		sendKeys(uname, email);
		sendKeys(pswd, password);
	}

	public void clickLogin() {
		click(loginbtn);
	}

	public void navigateToContactsPageAndCreate() {
		click(contactsbtn);
		click(createcontact);
	}

}
