package testnng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload2 {
	ChromeDriver driver;
	@BeforeTest
	public void abc()
	 {
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
@Test
public void bbc() throws AWTException
{
driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
String filepath=("C:\\Users\\91628\\Downloads\\SQL Commands.pdf");

Robot robo=new Robot();
robo.delay(3000);
StringSelection str=new StringSelection(filepath);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

robo.keyPress(KeyEvent.VK_CONTROL);
robo.keyPress(KeyEvent.VK_V);
robo.keyRelease(KeyEvent.VK_CONTROL);
robo.keyRelease(KeyEvent.VK_V);

robo.keyPress(KeyEvent.VK_ENTER);
robo.keyRelease(KeyEvent.VK_ENTER);
}
}
