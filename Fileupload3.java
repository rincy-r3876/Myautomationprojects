package testnng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload3 {
ChromeDriver driver;
@BeforeTest
public void abbb()
{
driver=new ChromeDriver();
driver.get("https://www.grammarly.com/plagiarism-checker");

//driver.get("C:\\Users\\91628\\Downloads\\SQL Commands.pdf");
}
@Test
public void abbc() throws AWTException
{
	Robot rb=new Robot();
	rb.delay(3000);
	String path=("C:\\Users\\91628\\Downloads\\SQL Commands.pdf");
	StringSelection str=new StringSelection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
}
}
