package testnng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporttt3 {
	WebDriver driver;
String baseurl="demo.guru99.com/test/upload/";
ExtentHtmlReporter reporter;
ExtentTest test;
ExtentReports report;
@BeforeTest
public void one()
{
reporter=new ExtentHtmlReporter("./Reports/guru99report.html");	
reporter.config().setDocumentTitle("fileuploadreport guru99");
reporter.config().setReportName("guru99 fileupload");
reporter.config().setTheme(Theme.DARK);

report=new ExtentReports();
report.attachReporter(reporter);
report.setSystemInfo("host", "local host");
report.setSystemInfo("tested by", "rincy");
}
@BeforeMethod
public void two()
{
driver=new ChromeDriver();
driver.get(baseurl);
}
@Test
public void three()
{
test=report.createTest("title verification");
  String actual=driver.getTitle();
String exp="guru99 demosite";
if(actual.equals(exp))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
}
@Test
public void four() throws AWTException
{
	test=report.createTest("file upload");
	Robot robo=new Robot();
	driver.findElement(By.id("uploadfile_0"));
	driver.findElement(By.id("submitbutton"));
	StringSelection str=new StringSelection("C:\\Users\\91628\\OneDrive\\Pictures\\Screenshots\\jnm.png");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
robo.keyPress(KeyEvent.VK_CONTROL);
	robo.keyPress(KeyEvent.VK_V);
	robo.keyRelease(KeyEvent.VK_CONTROL);
	robo.keyRelease(KeyEvent.VK_V);
	
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	
}
@AfterTest
public void five()
{
	report.flush();
}
}
