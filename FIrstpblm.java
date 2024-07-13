package testnng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FIrstpblm {
	ChromeDriver driver;
@BeforeTest
   public void mm()
{
    driver=new ChromeDriver();	
}
@BeforeMethod
public void gg()
{
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test(priority = 1, groups = "retest")
public void mn()
{
String Title=driver.getTitle();
String exptitle="rediff.com";
if(Title.equals(exptitle))
{
	System.out.println("pass");
}
else
{
System.out.println("fail");	
	
}
}
@Test (priority = 2, groups = "regression")
public void ln()
{
WebElement btn=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]"));	
String text=btn.getText();
System.out.println(text);
}
	

}
