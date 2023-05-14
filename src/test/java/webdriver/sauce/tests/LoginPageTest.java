package webdriver.sauce.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import webdriver.sauce.base.TestBase;
import webdriver.sauce.pages.HomePage;
import webdriver.sauce.pages.LoginPage;
import webdriver.sauce.util.TestUtil;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	
	String sheetName = "login";

	public LoginPageTest() {
		super();

	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void logpageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Swag Labs", "Login Page Title not matched");
	}

	@Test(priority = 2)
	public void SwaglablogoTest() {
		boolean flag = loginPage.Swaglablogo();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void loginTest() {
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}
	
	@DataProvider
	public Object[][] LoginTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=4, dataProvider="LoginTestData")
	public void validatingmultiplelogin(String username, String password) {
	loginPage.login(username, password);
		
		}
	

	
	 @AfterMethod 
	 public void tearDown() {
	 driver.quit(); }
	 
}
