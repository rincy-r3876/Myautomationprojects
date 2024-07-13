package testnng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross2 {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void one(String browser)
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
	public void two ()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	

}
