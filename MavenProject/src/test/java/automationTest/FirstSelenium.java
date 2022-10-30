package automationTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import dataEntity.CreateAccount;
import pageObjects.CreateAccountPage;
import pageObjects.LoginPage;


public class FirstSelenium {

@Test
public void CreateAccountEmailValidationforValidEmail() throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60)); //for every page loading timeout
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90)); //for every Element to be present in page, timeout.
	
	driver.get("http://automationpractice.com/index.php");

	LoginPage _login = new LoginPage(driver);
	_login.clickSignIn(); 
	_login.enterEmail("vaidee@gmail.com");
	
	Assert.assertTrue(_login.isEmailValid(),"We Expected True but returned False");
	
	//CreateAccountPage _accPage = new CreateAccountPage(driver);
	CreateAccountPage _accPage=_login.clickCreateAccount();
	CreateAccount values = new CreateAccount();
	//read json file and Deserialize it as CreateAccount Object
	values.setTitle("Mrs");
	values.setFName("Vaidee");
	values.setLName("Ssb");
	values.setPassword("HelloWorld");
	values.setEmail("vaidee@gmail.com");
	values.setDate("31/January/1988");
	values.SignUpforNewsLetter = true;
	_accPage.FillForm(values);
	
	
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
	
	_login.clickCreateAccount();
	

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


