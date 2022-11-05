package pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class autologin extends baseclass  
{
	WebDriver driver;
	 
	By _email= By.xpath("//form[@id='create-account_form']//label[@for='email_create']/following-sibling::input");
	By _create= By.xpath("//button[@id='SubmitCreate']");
	By _signin=By.linkText("Sign in");
	By _validateemail=By.xpath("//form[@ id=\"create-account_form\"]//div[contains(@ class,'form-group')]");		
	
	public autologin(WebDriver driver)
	{
		super(driver);
	this.driver=driver;	
	}
public void signin()
{
	FindElement(_signin).click();
	//WebElement sign=driver.findElement(_signin);
	//sign.click();
}
public void email(String email)
{
	FindElement(_email).sendKeys(email);
	FindElement(_email).sendKeys(Keys.TAB);
	
	//WebElement emaill=driver.findElement(_email);
	//emaill.sendKeys(email);
}
public createaccountpage createaccounts()
{	
	FindElement(_create).click();
	//WebElement createacc=driver.findElement(_create);
return new createaccountpage(driver);
	//createacc.click();
	 
}
public boolean isvalidemail()
{
if(FindElement(_validateemail).getAttribute("class").contains("form-ok"))
{
return true;
}
else {
return false;	
}
}

}