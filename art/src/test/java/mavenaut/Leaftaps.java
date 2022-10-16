package mavenaut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Leaftaps {
@Test
public void  firsttestcase(){	
//System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe")
System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.quit();
	}
}