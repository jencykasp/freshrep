package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage {

	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}

	By _firstName = By.id("customer_firstname");
	
	
	
	public void enterFirstName(String fName) {
		FindElement(_firstName).sendKeys(fName);
	}
	
	
}
