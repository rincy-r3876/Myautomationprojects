package testnng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Action4 {
	WebDriver driver;
	@BeforeTest
	public void pu()
	{
	driver=new ChromeDriver();
	driver.get("https://www.myntra.com/login/password");
	}
	@Test
	public void puu()
	{
		
	}

}
