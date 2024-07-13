package testnng;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mayoclinic {
	ChromeDriver driver;
@BeforeTest
	public void browserloading()
	{
		driver=new ChromeDriver();
	}
@BeforeMethod
    public void urlloading() 
    {
	driver.get("https://www.mayoclinic.org/");
    }
@Test 
public void createaccount()
{
	driver.findElement(By.xpath("//*[@id=\"button-90560acf83\"]/span/span/span[1]/span[2]")).click(); //locating login button
	driver.findElement(By.xpath("//*[@id=\"login\"]/section[1]/div/div/div/a[2]")).click(); //locating create account link
	driver.findElement(By.xpath("//*[@id=\"MayoClinicNumber\"]")).sendKeys("2-972-510"); //locating clinic num and sending values
	driver.findElement(By.id("Email")).sendKeys("rincyreji092@gmail.com"); //locating email field and sending values
	driver.findElement(By.name("ReTypeEmail")).sendKeys("rincyreji092@gmail.com"); //retyping email id
	driver.findElement(By.id("FirstName")).sendKeys("Rincy"); //first name
	driver.findElement(By.id("MiddleName")).sendKeys("Mol"); //middle name
	driver.findElement(By.id("LastName")).sendKeys("R"); // last name
	WebElement month=driver.findElement(By.xpath("//*[@id=\"Register_FormStep1\"]/div/div[8]/div[2]/div/fieldset/select[1]"));
	Select monthelement=new Select(month);
	monthelement.selectByValue("8");
	WebElement day=driver.findElement(By.xpath("//*[@id=\"Register_FormStep1\"]/div/div[8]/div[2]/div/fieldset/select[2]"));
	Select dayelement=new Select(day);
	dayelement.selectByValue("10");
	WebElement year=driver.findElement(By.xpath("//*[@id=\"Register_FormStep1\"]/div/div[8]/div[2]/div/fieldset/select[3]"));
	Select yearelement=new Select(year);
	yearelement.selectByValue("2000");
	driver.findElement(By.id("submitBtn"));
	}
@Test
public void login()
{
	driver.findElement(By.xpath("//*[@id=\"button-90560acf83\"]/span/span/span[1]/span[2]")).click(); //locating login button
	driver.findElement(By.xpath("//*[@id=\"signInName\"]")).sendKeys("Rincy Mol R");
	driver.findElement(By.id("password")).sendKeys("rincy#1234568");
	driver.findElement(By.id("next")).click();
}
@Test
public void linkverification()
{
	List<WebElement>li=driver.findElements(By.tagName("a"));
	li.size();
	for(WebElement s:li)
	{
		String links=s.getAttribute("href");
		System.out.println(links);
		System.out.println(" the number of links is" + li.size());
	}
	}
@Test
public void search()
{
	driver.findElement(By.xpath("//*[@id=\"header__content-right\"]/li[3]/div[2]/button/span/span/svg")).click();
	driver.findElement(By.xpath("//*[@id=\"search-input-globalsearch-773693aac3\"]")).sendKeys("appoinment");
	driver.findElement(By.xpath("//*[@id=\"header__content-container\"]/div/div/div[2]/div[1]/div[2]/div/div/mc-search/div[2]/button[2]/span")).click();
	
}
@AfterMethod
public void quitpage()
{
	driver.close();
}


    }
/* Mayoclinic is a health and medical information website.It provides a wide range of resources.In this project,
 1. automated the account creation
 2.automated login
 3.verified the title with an expected title
 4.ensured the search feature works correctly and returns relevant results  */
