package automationtesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobj.autologin;
import pageobj.createaccountpage;
import pageobj.createaccounts;


public class Thirdauto {

@Test	
public void validemail() throws Exception
{

System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");		
WebDriver driver=new ChromeDriver();
driver.get("http://automationpractice.com/index.php");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));


autologin log= new autologin(driver);
log.signin();
log.email("jeni.kasp@gmail.com");
Assert.assertTrue(log.isvalidemail(),"we expected true but returned false");
//System.out.println(log.isvalidemail());
createaccountpage create= log.createaccounts();
createaccounts values = new createaccounts(); 
values.settitle("Mrs");
values.setfirstname("Jency");
values.setlastname("kasp");
values.setemail("jeni.kasp@gmail.com");
values.setpassword("pass123");
values.setcheque("Sign up for our newsletter!");
values.setdate("1/1/1988");
values.setstate("Alabama");
values.setcompany("Pepsi");
values.setcountry("United States ");
values.setaddress("Green park");
values.setaddress1("birchyard flats");
values.setcity("Austin");
values.setzip("00000");
values.setinfo("good");
values.sethomephone("7888888");
values.setmobilephone("3344444");
values.setaltaddress("Rainbow apartment");
create.FillForm(values);
create.register();
driver.quit();
}
@Test
public void invalidemail()
{

System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");		
WebDriver driver=new ChromeDriver();
driver.get("http://automationpractice.com/index.php");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));


autologin log= new autologin(driver);
log.signin();
log.email("ggggggg");
Assert.assertFalse(log.isvalidemail(),"we expected false but returned true");
//System.out.println(log.isvalidemail());
//createaccount create =log.createaccounts();
createaccountpage create= log.createaccounts();
driver.quit();

}	
@Test
public void createaccount()
{
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");		
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
    driver.manage().window().maximize();

	autologin log= new autologin(driver);
	log.signin();
	log.email("jency.kasp@gmail.com");
	Assert.assertTrue(log.isvalidemail(),"we expected true but returned false");
	//System.out.println(log.isvalidemail());
	log.createaccounts();	
}	

}


