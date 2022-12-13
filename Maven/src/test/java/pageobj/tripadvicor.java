package pageobj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataentity.amazonentity;
import dataentity.tripentity;

public class tripadvicor extends baseclass
{
	WebDriver driver;
	By search= By.xpath("//form[@ role='search']/input[1]");
	public tripadvicor(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public void selectplace(String place) {
		//String search;
	//	By search= By.xpath("//form[@ role='search']/input[1]");
		//WebElement element= driver. findElement(By.xpath("//form[@ role='search']/input[1]"));
	//Actions	actions=new Actions(driver);
	//actions.moveToElement(element);
	//actions.perform();
	//WebElement search=driver.findElement(By.xpath("//form[@ role='search']/input[1]"));
		//FindElement(By.xpath("//form[@ role='search']/input[1]")).sendKeys(Keys.RETURN);
	//	FindElement(By.xpath("//div[@id='typeahead_results']//a[1]")).click();
//	sendkeys(driver,search,10,"club mahindra");
		FindElement(search).sendKeys(place);	
		
		
		
		
		
	
	
	}
	

	/*public static void sendkeys(WebDriver driver,WebElement element,Duration timeout , String value) 
	{
	new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
	element.sendKeys(value);
	}*/
	
	public void FillForm(tripentity values) {
		
		selectplace(values.getplace());
				
		}
	
	
	 

}
