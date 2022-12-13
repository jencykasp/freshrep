package automationtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dataentity.amazonentity;
import dataentity.tripentity;
import pageobj.amazonflip;
import pageobj.tripadvicor;

public class trip {
@Test
	public void checktrip() {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tripadvisor.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		tripadvicor trip = new tripadvicor(driver);
		tripentity values = new tripentity();
	
		//FindElement(By.xpath("//form[@ role='search']/input[1]")).sendKeys(Keys.RETURN);
	//	FindElement(By.xpath("//div[@id='typeahead_results']//a[1]")).click();
		values.setplace("club mahindra");
		trip.FillForm(values);		// TODO Auto-generated constructor stub
			}

	


}
