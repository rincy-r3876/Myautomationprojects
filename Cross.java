package testnng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void ll(String browser)
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
public void v()
{
	driver.get("https:/www.luminartechnolab.com");
}
}
