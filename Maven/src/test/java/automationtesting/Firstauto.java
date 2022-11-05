package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobj.Inventory;
import pageobj.Login;
import pageobj.productlink;


public class Firstauto {

@Test	
public void myfirsttestcase()
{
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");	
	WebDriver driver= new ChromeDriver();

	driver.get("https://www.saucedemo.com/");
	
	Login log= new Login(driver);
	log.enterusername("standard_user");
	log.enterpassword("secret_sauce");
	log.clicklogin();

	Inventory invent= new Inventory(driver);
	System.out.println(invent.verify());
	
	productlink prod= new productlink(driver);
	//System.out.println(prod.clickproduct());
prod.clickproduct();
	driver.quit();
}
	
}	
//@Test
/*public void mysecondtestcase()
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