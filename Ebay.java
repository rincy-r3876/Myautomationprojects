package testnng;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
	WebDriver driver;
	@BeforeTest
	public void ab()
	{
	driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	}
	@Test
	public void bb()
	{
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement Electronics=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
	Actions act=new Actions(driver);
	act.moveToElement(Electronics);
	act.perform();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement wb=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
wb.click();
	
	}
	
}
