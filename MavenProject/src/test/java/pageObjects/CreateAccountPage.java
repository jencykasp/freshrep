package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import dataEntity.CreateAccount;
import dev.failsafe.internal.util.Assert;

public class CreateAccountPage extends BasePage {

	public CreateAccountPage(WebDriver driver) {
		super(driver);
	}
	By _TitleMr = By.xpath("//input[@name='id_gender'][@value='1']");
	By _TitleMrs = By.xpath("//input[@name='id_gender'][@value='2']");
	By _firstName = By.id("customer_firstname");
	By _lastName = By.id("customer_lastname");
	By _email = By.id("email");
	By _day =  By.id("days");
	By _months =  By.id("months");
	By _year =  By.id("years");
	
	private void enterFirstName(String fName) {
		FindElement(_firstName).sendKeys(fName);
	}
	
	private void enterLastName(String value) {
		FindElement(_lastName).sendKeys(value);
	}
	
	private void selectTitle(String value) throws Exception {
		
		if(value == "Mr") {
			if(!FindElement(_TitleMr).isSelected())
				FindElement(_TitleMr).click();
			
		} else if(value == "Mrs") {
			if(!FindElement(_TitleMr).isSelected())
				FindElement(_TitleMrs).click();
		}else {
			throw new Exception("Invalid Selection for Title");
		}
	}
	
	private boolean verifyEmail(String value) {
		if(value == FindElement(_email).getText())
		 return true;
		else 
			return false;
	}
	private void selectDate(String value) {
		String dd = value.split("/")[0];
		String month =value.split("/")[1];
		String yy = value.split("/")[2];
		
		Select selectDays = new Select(FindElement(_day));
		selectDays.selectByValue(dd);
		
		Select selectMonth = new Select(FindElement(_months));
		selectMonth.selectByVisibleText(month);
		
		Select selectYear = new Select(FindElement(_year));
		selectYear.selectByValue(yy);
	}
	
	public void FillForm(CreateAccount value) throws Exception {
		
		selectTitle(value.getTitle());
		enterFirstName(value.getFName());
		enterLastName(value.getLName());
		selectDate(value.getDate());
		Assert.isTrue(verifyEmail(value.getEmail()),"Email Enetered is not appeared on create acc page");
		
	}
	
}
