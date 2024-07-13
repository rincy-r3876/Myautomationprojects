package testnng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload1 {
	ChromeDriver driver;
	@BeforeTest
	public void aa()
	{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
	}
@Test
public void bb()
{
	driver.findElement(By.id("uploadfile_0")).sendKeys("C://Users//91628//OneDrive//Desktop//alertbox.html");;
	


driver.findElement(By.name("send")).click();
}
}