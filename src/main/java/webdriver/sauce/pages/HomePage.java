package webdriver.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import webdriver.sauce.base.TestBase;

public class HomePage extends TestBase {
	
	//Page Factory
	
	public HomePage() {
    PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean SwaglablogoonHomepage() {
		return Homepagelogo.isDisplayed();

	}
	
	//Web Element locators
	@FindBy(xpath = "//div[contains(@class,'app_logo')]")
	@CacheLookup
	WebElement Homepagelogo;
	
	
	
	
	
	
	
	
	
	
	
	
	//title : Single Page Apps for GitHub Pages
	
	
	


}
