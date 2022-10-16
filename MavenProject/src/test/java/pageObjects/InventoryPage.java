package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {

	WebDriver driver;
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By _title = By.className("title");
	
	public String verifyPageTitle() {
		WebElement title = driver.findElement(_title);
		return title.getText();
	}
	
}
