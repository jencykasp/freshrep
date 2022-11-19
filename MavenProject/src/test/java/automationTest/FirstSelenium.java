package automationTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dataEntity.CreateAccount;
import pageObjects.CreateAccountPage;
import pageObjects.LoginPage;


public class FirstSelenium {

	WebDriver driver;
	
	@Parameters({"browser","URL"})
	@BeforeMethod
	public void SetupTest(String browser, String URL) throws Exception {
		
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox"))
		{
			System.setProperty("webdriver..driver", "D:\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			throw new Exception("Browser Name invalid ");
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60)); //for every page loading timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90)); //for every Element to be present in page, timeout.
		
		driver.get(URL);
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	
	@Test(dataProvider = "MultipleUsers")
	public void ValidLoginWithEmail(String user , String password) throws Exception {
	
		System.out.println("UserName is : " + user);
		System.out.println("Password is : " + password);
		
		
	/*LoginPage _login = new LoginPage(driver);
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
	
	*/

	}
	
	@DataProvider(name = "MultipleUsers")
	public Object[][] abcd() {
		return new Object[][]
				{
			
				{ "standard_user", "secret_sauce" },
	            { "locked_out_user", "secret_sauce" },
	            { "problem_user", "secret_sauce" },
	            {"performance_glitch_user","secret_sauce"}
			
				};
	}
	

@Test
public void ValidLoginWithUsername() {
	
	LoginPage _login = new LoginPage(driver);
	_login.clickSignIn(); 
	_login.enterEmail("aslksdkfjhsdf");
	
	Assert.assertFalse(_login.isEmailValid(),"We Expected False but returned True");
	
	_login.clickCreateAccount();
	

	}

@Test
public void ValidLoginWithMobileNo() {
	
	LoginPage _login = new LoginPage(driver);
	_login.clickSignIn(); 
	_login.enterEmail("aslksdkfjhsdf");
	
	Assert.assertFalse(_login.isEmailValid(),"We Expected False but returned True");
	
	_login.clickCreateAccount();
	
	

}
	
}


