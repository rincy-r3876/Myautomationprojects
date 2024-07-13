package testnng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload4 {
	ChromeDriver driver;
	@BeforeTest
	public void fo()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
	}
@Test
public void be() throws AWTException
{
	driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
	String filepath=("C:\\Users\\91628\\OneDrive\\Pictures\\Screenshots\\Screenshot.png");
	Robot rb=new Robot();
	rb.delay(3000);
	StringSelection str=new StringSelection(filepath);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	
}
}
