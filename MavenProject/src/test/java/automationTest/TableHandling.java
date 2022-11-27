package automationTest;

import java.awt.event.ActionEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class TableHandling {

@Test
public void TableHandling_Test() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	// System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");
	Actions action = new Actions(driver);
	
	WebElement EmailElement = WaitForElementInSecs(driver, By.xpath("//*[@id='subscribe-email']/input"), 60);
	
	action.sendKeys(EmailElement, "vaidee@email.com");
	
	Thread.sleep(5000);
	
	List<WebElement> trs = WaitForElementsInSecs(driver,By.xpath("//table/tbody/tr"),60);
	action.scrollToElement(trs.get(0)).build().perform();
	
	for(int i=1 ; i < trs.size() ; i++) {
		
		List<WebElement> tds = WaitForElementsInSecs(driver,By.xpath("//table/tbody/tr["+i+"]/td"),60);
		action.moveToElement(WaitForElementInSecs(driver,By.xpath("//table/tbody/tr["+i+"]/td[1]"),60)).build().perform();
		
		String link = WaitForElementInSecs(driver,By.xpath("//table/tbody/tr["+i+"]/td[1]"),60).getText();
		String type =WaitForElementInSecs(driver,By.xpath("//table/tbody/tr["+i+"]/td[2]"),60).getText();
		String desc =WaitForElementInSecs(driver,By.xpath("//table/tbody/tr["+i+"]/td[3]"),60).getText();
		
		System.out.println(link);
		if ( link.equals("Swag Labs"))
		{
			System.out.println(type);
			System.out.println(desc);
			tds.get(0).click();
			break;
		}
	}
	

	Thread.sleep(5000);
	
	driver.quit();
	
}

public WebElement WaitForElementInSecs(WebDriver driver,By by,int maxSecs) {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(maxSecs));
	wait.pollingEvery(Duration.ofSeconds(5));
	return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	
	
}

public List<WebElement> WaitForElementsInSecs(WebDriver driver,By by,int maxSecs) {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(maxSecs));
	wait.pollingEvery(Duration.ofSeconds(5));
	return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
	
	
}
	
}

