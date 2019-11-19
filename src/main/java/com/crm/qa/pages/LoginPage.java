package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'Log In')]")
	WebElement loginbtn;
	
	@FindBy(name = "email")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement login;

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signupbtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	public String validateLoginPage() {
		return driver.getTitle();

	}

	public HomePage login(String un, String pwd) {
		loginbtn.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		return new HomePage();
	}

}
