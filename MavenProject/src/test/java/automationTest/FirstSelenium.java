package automationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.InventoryPage;
import pageObjects.LoginPage;


public class FirstSelenium {

@Test
public void MyFirstTestCase() {
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.saucedemo.com/");

	LoginPage _login = new LoginPage(driver);
	_login.enterUserName("standard_user");
	_login.enterPassword("secret_sauce");
	_login.clickLogin();
	
	InventoryPage _inventory = new InventoryPage(driver);
	System.out.println(_inventory.verifyPageTitle());
	
	
	driver.quit();
}

	
}

//  different Elements and actions
//  Assertion
// More on Page Objects

