package testnng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions3 {
	WebDriver driver;
	@BeforeTest
	public void ac1()
	{
	driver=new ChromeDriver();	
	}
	@BeforeMethod
	public void ac2()
	{
	driver.get("https://ignou.samarth.edu.in/index.php/site/login");
	}
	@Test
	public void ac3()
	{
	WebElement Username=driver.findElement(By.xpath("//input[@id='loginform-username']"));
	
	WebElement password=driver.findElement(By.id("loginform-password"));
	Actions act=new Actions(driver);
	act.keyDown(Username, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	act.keyDown(Username, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	act.keyDown(password, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	act.perform();
	}
	

}
