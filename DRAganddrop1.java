package testnng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DRAganddrop1 {
	WebDriver driver;
	@BeforeTest
	public void o()
	{
	driver=new ChromeDriver();
	driver.get("https://demoqa.com/droppable/");
	}
	@Test
	public void oo()
	{
	WebElement drag=driver.findElement(By.xpath("//*[@id='draggable']"));
	WebElement drop=driver.findElement(By.xpath("//*[@id='droppable']"));
	Actions act=new Actions(driver);
	act.dragAndDrop(drag, drop);
	act.perform();
	String actual=drop.getText();
	String exp="dropped";
	if(actual.equals(exp))
	{
	System.out.println("pass");	
	}
	else
	{
	System.out.println("fail");	
	}
	}

}
