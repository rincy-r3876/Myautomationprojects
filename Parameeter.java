package testnng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameeter {
	ChromeDriver driver;
	@BeforeTest
	public void abcde()
	{
		driver=new ChromeDriver();
		driver.get("https:/www.google.com");
	}
	@Parameters("s")
@Test
public void fghji(String s)
{
driver.findElement(By.name("q")).sendKeys(s,Keys.ENTER);	
}
}
