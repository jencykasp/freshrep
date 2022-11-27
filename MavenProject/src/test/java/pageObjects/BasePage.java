package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	private WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;  // initializes the driver in same class i.e BasePage
	}

	public WebElement FindElement(By by) {
		try {
			return WaitForElementInSecs(by,60);
			
		}
		catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
			return null;
		}

	}
	
	public WebElement WaitForElementInSecs(By by,int maxSecs) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(maxSecs));
		wait.pollingEvery(Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		
		
	}
}
