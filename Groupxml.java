package testnng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groupxml {
WebDriver driver;
@BeforeTest
public void aa()
{
driver=new ChromeDriver();
driver.get("demo.guru99.com/test/upload/");
}
@Test(priority = 1, groups="smoke")
public void bb()
{
	 String actual=driver.getTitle();
	 String exp="guru99 demosite";
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
