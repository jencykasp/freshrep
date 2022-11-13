package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	private WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;  // initializes the driver in same class i.e BasePage
	}

	public WebElement FindElement(By by) {
		try {
			WebElement element = driver.findElement(by);
			return element;
		}
		catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
			return null;
		}
		
		
	}
}
