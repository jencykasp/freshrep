package pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import dataentity.createaccount;
import dev.failsafe.internal.util.Assert;

public class createaccountpage extends baseclass {
WebDriver driver;
	public createaccountpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}
	
	By _TitleMr = By.xpath("//input[@name='id_gender'][@value='1']");
	By _TitleMrs = By.xpath("//input[@name='id_gender'][@value='2']");
	By _firstName = By.id("customer_firstname");
By lastname=By.id("customer_lastname");
By email=By.id("email");
By chequebox1=By.id("newsletter");
By chequebox2=By.id("optin");
By day=By.id("days");
By month=By.id("months");
By year=By.id("years");
By state=By.id("id_state");
By password=By.id("passwd");
By company= By.id("company");
By address=By .id("address1");
By address1=By.id("address2");
By city=By.id("city");
By zip=By.id("postcode");
By info=By.id("other");
By homephone=By.id("phone");
By mobilephone=By.id("phone_mobile");
By altaddress=By.id("alias");
By register=By.id("submitAccount");
private void selecttitle(String value)throws Exception
{
	if (value=="Mr")
	{
		if(!FindElement(_TitleMr).isSelected())	
	FindElement(_TitleMr).click();	
	}
	else if(value=="Mrs")
	{
		if(!FindElement(_TitleMr).isSelected())
		FindElement(_TitleMrs).click();	
	}
	else
	{
		throw new Exception("Invalid Selection for Title");
	}
	
}
private void selectcheque(String value)
{
	 if(value=="Sign up for our newsletter!")
	 
	{
	if(!FindElement(chequebox2).isSelected())		
	FindElement(chequebox1).click();	
	}
	else if (value=="Receive special offers from our partners!")
	{
		if(!FindElement(chequebox2).isSelected())
		FindElement(chequebox2).click();	
	}
	else
	{
		FindElement(chequebox1).click();	
		FindElement(chequebox2).click();	


	}
	
}
private void enteraltaddress(String altadd)
{
	FindElement(altaddress).sendKeys(altadd);
}

private void entermobilephone(String mphone)
{
	FindElement(mobilephone).sendKeys(mphone);
}
private void enterhomephone(String hphone)
{
	FindElement(homephone).sendKeys(hphone);
}
private void enterinfo(String inform)
{
	FindElement(info).sendKeys(inform);
}

private void enterzip(String post)
{
	FindElement(zip).sendKeys(post);
}
private void entercity(String cit)
{
	FindElement(city).sendKeys(cit);
}
private void enteraddress1(String add1)
{
	FindElement(address1).sendKeys(add1);
}

private void enteraddress(String add)
{
	FindElement(address).sendKeys(add);
}
private void entercompany(String comp)
{
	FindElement(company).sendKeys(comp);
}
private void enterfirstname(String fname)
{
	FindElement(_firstName).sendKeys(fname);
}
private void enterlasttname(String lname)
{

	FindElement(lastname).sendKeys(lname);
}

private boolean verifyemail(String value)
{
if (value==FindElement(email).getText())

return true;
else
return false;
}
private void selectdate(String value)
{
String dd= value.split("/")[0];
String mont=value.split("/")[1];
String years=value.split("/")[2];
Select selectday=new Select(FindElement(day));
selectday.selectByValue(dd);
Select selectmonth=new Select(FindElement(month));
selectmonth.selectByValue(mont);
//selectmonth.selectByVisibleText(mont);
Select selectyear=new Select(FindElement(year));
selectyear.selectByValue(years);
}

private void enterpassword(String pwd)throws Exception
{
    if(pwd.length()<5)
    {
	  throw new Exception("Invalid password");
	
    }
    else
	{
	FindElement(password).sendKeys(pwd);
	}
}

private void selectstate(String value)
{
String st=value;
Select selectstate= new Select(FindElement(state));
selectstate.selectByVisibleText(st);
}

public void register()
{
	FindElement(register).click();
}
public void FillForm(createaccounts values) throws Exception
{
	selecttitle(values.gettitle());
	enterfirstname(values.getfirstname());
	enterlasttname(values.getlastname());
	//Assert.isTrue(verifyemail(values.getemail()),"Email Enetered is not appeared on create acc page");
	verifyemail(values.getemail());
	selectdate(values.getdate());
	selectcheque(values.getcheque());
	selectstate(values.getstate());	
	enterpassword(values.getpassword());
	entercompany(values.getcompany());
	enteraddress(values.getaddress());
	enteraddress1(values.getaddress1());
	entercity(values.getcity());
	enterzip(values.getzip());
	enterinfo(values.getinfo());
	enterhomephone(values.gethomephone());
	entermobilephone(values.getmobilephone());
	enteraltaddress(values.getaltaddress());
	
}

}   

