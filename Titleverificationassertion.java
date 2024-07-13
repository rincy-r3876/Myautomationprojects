package testnng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//ASSERTIONS SOFT & HARD


public class Titleverificationassertion {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
@Test
public void title()
{
String actual=driver.getTitle();
String exp="fb";
//Assert.assertEquals(actual, exp); // hard assertion
//soft assertion
SoftAssert soft=new SoftAssert();
soft.assertEquals(actual, exp);
}}