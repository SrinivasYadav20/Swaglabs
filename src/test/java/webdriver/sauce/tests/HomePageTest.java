package webdriver.sauce.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import webdriver.sauce.base.TestBase;
import webdriver.sauce.pages.HomePage;
import webdriver.sauce.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void VerifyHomePageTitle() {
		String HomePageTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(HomePageTitle, "Swag Labs", "Home Page Title not matched");
	}

	@Test(priority = 2)
	public void HomePageLogoTest() {
		boolean flag = homepage.SwaglablogoonHomepage();
		Assert.assertTrue(flag);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
