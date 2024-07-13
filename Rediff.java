package testnng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Rediff {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void rf1(String browser)
	{
	if(browser.equalsIgnoreCase("chrome"))	
	{
		driver=new ChromeDriver();
	}
	else
	{
		driver=new EdgeDriver();
	}
	}
	@Test
	public void rf2()
	{
	driver.get("https://www.shoe-kart.com/");	
	}

}
