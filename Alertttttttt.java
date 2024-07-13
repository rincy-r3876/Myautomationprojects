package testnng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alertttttttt {
	WebDriver driver;
	@BeforeTest
	public void be()
	{
	driver=new ChromeDriver();	
	}
	@BeforeMethod
	public void fo()
	{
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");	
	}
	@Test
	public void re()
	{
	WebElement right=driver.findElement(By.xpath("//*[@id='authentication']/span"));
	Actions act=new Actions(driver);
	act.contextClick(right);
	act.perform();
	driver.switchTo().alert().accept();
	WebElement dblclick=driver.findElement(By.xpath("//*[@id='authentication']/button"));
	act.doubleClick(dblclick);
	driver.switchTo().alert().accept();
	}
	
}
