package testnng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//actions classs rediff il username il oru input koduknm ath keyboard vazhi email id field il copy paste cheynm
public class Action {
	ChromeDriver driver;
@BeforeTest
public void m1()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void m2()
{
WebElement fullname=driver.findElement(By.xpath("//input[@id='newpasswd']"));
WebElement mailid=driver.findElement(By.xpath("//input[@name='confirm_passwd5401561c']"));
Actions act=new Actions(driver);
act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
act.keyDown(mailid,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
act.keyDown(mailid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
act.perform();
}
}
