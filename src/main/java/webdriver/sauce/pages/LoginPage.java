package webdriver.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import webdriver.sauce.base.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean Swaglablogo() {
		return loginpagelogo.isDisplayed();

	}

	/*
	 * public void LoginpageLogo() { boolean flag = loginpagelogo.isDisplayed();
	 * Assert.assertTrue(flag); }
	 */

	public HomePage login(String usname, String paswrd) {
		username.sendKeys(usname);
		password.sendKeys(paswrd);
		submitbtn.click();
		return new HomePage();
	}

	
	//Web Element locators
	@FindBy(xpath = "//input[contains(@id,'user-name')]")
	WebElement username;

	@FindBy(xpath = "//input[contains(@id,'password')]")
	WebElement password;

	@FindBy(xpath = "//input[contains(@id,'login-button')]")
	WebElement submitbtn;

	@FindBy(xpath = "//div[contains(@class,'login_logo')]")
	@CacheLookup
	WebElement loginpagelogo;

}
