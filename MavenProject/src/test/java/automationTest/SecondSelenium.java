package automationTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SecondSelenium {

@Test
public void MyThirdTestCaseProductDetails() {
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	// System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.saucedemo.com/");

	driver.findElement(By.id("user-name")).sendKeys("standard_user");

	driver.findElement(By.id("password")).sendKeys("secret_sauce");

	driver.findElement(By.name("login-button")).click();

	// products code
	
	
}

	
}


// 100 TC  - 100 main programs
//Test Framework - To Organize the tests in automation and to Run Test using TestRunner
// JUnit - stable and very old 
// TestNg - Next Gen Testing Framework for Java

// Selenium 

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