package automationTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CreateAccountPage;
import pageObjects.LoginPage;


public class FirstSelenium {

@Test
public void CreateAccountEmailValidationforValidEmail() {
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60)); //for every page loading timeout
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90)); //for every Element to be present in page, timeout.
	
	driver.get("http://automationpractice.com/index.php");

	LoginPage _login = new LoginPage(driver);
	_login.clickSignIn(); 
	_login.enterEmail("vaidee@gmail.com");
	
	Assert.assertTrue(_login.isEmailValid(),"We Expected True but returned False");
	
	_login.clickCreateAccount();
	driver.quit();
}

@Test
public void CreateAccountEmailValidationforInValidEmail() {
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60)); //for every page loading timeout
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90)); //for every Element to be present in page, timeout.
	
	driver.get("http://automationpractice.com/index.php");

	LoginPage _login = new LoginPage(driver);
	_login.clickSignIn(); 
	_login.enterEmail("aslksdkfjhsdf");
	
	Assert.assertFalse(_login.isEmailValid(),"We Expected False but returned True");
	
	CreateAccountPage _createAcc= _login.clickCreateAccount();
	

	driver.quit();
}

@Test
public void CreateAccountForEmailEntered() {
System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60)); //for every page loading timeout
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90)); //for every Element to be present in page, timeout.
	driver.manage().window().maximize();
	
	driver.get("http://automationpractice.com/index.php");
	
	LoginPage _login = new LoginPage(driver);
	_login.clickSignIn(); 
	_login.enterEmail("aslksdkfjhsdf");
	
	Assert.assertFalse(_login.isEmailValid(),"We Expected False but returned True");
	
	_login.clickCreateAccount();
	
	

}
	
}


