package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	By _usernameInput = By.id("user-name");
	By _passwordInput = By.id("password");
	By _loginButton = By.name("login-button");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName(String name) {
		WebElement username = driver.findElement(_usernameInput);
		username.sendKeys(name);
	}
	
	public void enterPassword(String pass) {
	WebElement password = driver.findElement(_passwordInput);
	password.sendKeys(pass);
	}
	
	public void clickLogin() {
		WebElement login = driver.findElement(_loginButton);
		login.click();
	}

	
}
