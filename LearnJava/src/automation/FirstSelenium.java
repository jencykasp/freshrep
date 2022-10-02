package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		
		// I refer Selenium as driver in my programs..
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.name("login-button")).click();
		
		driver.quit();
	}

}
