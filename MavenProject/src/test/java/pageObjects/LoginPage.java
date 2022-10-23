package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{
	WebDriver driver;
		
	By _signIn = By.linkText("Sign in");
	By _emailIDInput = By.id("email_create");
	By _createAccountButton = By.id("SubmitCreate");
	By _validateEmailInput = By.xpath("//form[@id='create-account_form']//div[contains(@class,'form-group')]");
			
	public LoginPage(WebDriver driver) {
		super(driver); // calls the constructor of BasePage
		this.driver = driver;
	}
	
	public void clickSignIn() {
		FindElement(_signIn).click();
	}
	
	public void enterEmail(String emailId) {
		FindElement(_emailIDInput).sendKeys(emailId);	
		FindElement(_emailIDInput).sendKeys(Keys.TAB);
	}
	
	public CreateAccountPage clickCreateAccount() {
		FindElement(_createAccountButton).click();
		return new CreateAccountPage(driver);
	}
	
	public boolean isEmailValid() {
		if(FindElement(_validateEmailInput).getAttribute("class").contains("form-ok")) {
			return true;
		}
		else {
			return false;
		}
	}
}
