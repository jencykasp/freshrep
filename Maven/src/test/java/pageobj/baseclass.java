package pageobj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseclass {


WebDriver driver;

public baseclass(WebDriver driver)
{
this.driver=driver;	
}
public WebElement FindElement(By by )
{
	
	WebElement element=driver.findElement(by);
	return element;
	    
	    //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(maxSec));
		//return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		
}
}
