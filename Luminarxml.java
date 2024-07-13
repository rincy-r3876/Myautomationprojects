package testnng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Luminarxml {
	ChromeDriver driver;
	@BeforeTest
	public void bb() {
		driver=new ChromeDriver();
		driver.get("https:/www.google.com");
	}
	@Parameters("L")
@Test
public void hh(String L)
{
	driver.findElement(By.name("q")).sendKeys(L,Keys.ENTER);	
}
}
