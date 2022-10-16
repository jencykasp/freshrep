package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Firstauto {

@Test	
public void myfirsttestcase()
{
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");	
	WebDriver driver= new ChromeDriver();

	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.name("login-button")).click();
	driver.quit();
	
}
	
	
@Test
public void mysecondtestcase()
{

	System.out.println("It decor room" );
}
}
/*
System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");	
WebDriver driver= new ChromeDriver();

driver.get("https://www.saucedemo.com/");
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");
driver.findElement(By.name("login-button")).click();
driver.quit();
*/