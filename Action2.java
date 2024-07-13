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

public class Action2 {
	WebDriver driver;
	@BeforeTest
	public void d1() {
	driver=new ChromeDriver();	
	}
	@BeforeMethod
	public void d2()
	{
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");	
	}
	@Test
	public void d3()
	{
	WebElement password=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input"));
	WebElement repassword=driver.findElement(By.xpath("//input[@id='newpasswd1']']"));
	Actions act=new Actions(driver);
	act.keyDown(password, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	act.keyDown(password, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	act.keyDown(repassword, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	act.perform();
	}

}
