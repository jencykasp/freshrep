package automationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FirstSelenium {

@Test
public void MyFirstTestCase() {
	System.out.println("First Test");
}

	@Test
	public void MySecondTest() {
		System.out.println("Second Test");
	}
}


// 100 TC  - 100 main programs
//Test Framework - To Organize the tests in automation and to Run Test using TestRunner
// Also geneerates emailable Test Report 
// JUnit - stable and very old 
// TestNg - Next Gen Testing Framework for Java



/*
//I refer Selenium as driver in my programs..
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	// System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.saucedemo.com/");

	driver.findElement(By.id("user-name")).sendKeys("standard_user");

	driver.findElement(By.id("password")).sendKeys("secret_sauce");

	driver.findElement(By.name("login-button")).click();

	driver.quit();

*/