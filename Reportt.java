package testnng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reportt {
	WebDriver driver;
	String baseurl="https:/www.facebook.com/";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	@BeforeTest
	public void abc()
	{
	reporter=new ExtentHtmlReporter("./Reports/report2.html");
	
	reporter.config().setTheme(Theme.STANDARD);
	reporter.config().setDocumentTitle("Automation report of fb loginpage");
	reporter.config().setReportName("Fbreport");
	
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "Rincy");
	extent.setSystemInfo("os", "windows");
	
	}
@BeforeMethod
public void bbc()
{
driver=new ChromeDriver();
driver.get(baseurl);
}
@Test(priority = 1)
public void cbc()
{
test=extent.createTest("title verification");
String actual=driver.getTitle();
String exp="fb";
if(actual.equals(exp))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
}
@Test(priority = 2)
public void dbc() throws IOException
{
test=extent.createTest("screenshot");
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(src, new File("C:\\Users\\91628\\OneDrive\\Pictures\\Saved Pictures.png"));

}
@AfterTest
public void ebc()
{
extent.flush();	
}
}
