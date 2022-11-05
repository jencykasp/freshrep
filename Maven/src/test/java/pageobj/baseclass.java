package pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class baseclass {

WebDriver driver;

public baseclass(WebDriver driver)
{
this.driver=driver;	
}
public WebElement FindElement(By by)
{
WebElement element= driver.findElement(by);
return element;
}
}
