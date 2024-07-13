package testnng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class CC {
	WebDriver driver;
	@BeforeTest
	public void befo()
	{
		driver=new ChromeDriver();
		driver.get("https:/www.facebook.com/");
	}

}
