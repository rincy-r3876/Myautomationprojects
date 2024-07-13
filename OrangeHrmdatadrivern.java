package testnng;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHrmdatadrivern {
	WebDriver driver;
	@BeforeTest
	public void or1()
	{
	driver=new ChromeDriver();	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
@Test
public void or2() throws IOException
{
FileInputStream str=new FileInputStream("C:\\Users\\91628\\OneDrive\\Documents\\Book2.xlsx");	
XSSFWorkbook wb=new XSSFWorkbook(str);
XSSFSheet sh=wb.getSheet("Sheet 1");
int rowcount=sh.getLastRowNum();
for(int i=0;i<=rowcount;i++)
{
	try {
		
	XSSFCell user=sh.getRow(i).getCell(0);
	String username=user.getStringCellValue();
	
	XSSFCell pass=sh.getRow(i).getCell(1);
	String password=pass.getStringCellValue();
	
	System.out.println("username"+username);
	System.out.println("password"+password);
	
	driver.findElement(By.xpath("//input[@name='username']")).clear();
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	
	driver.findElement(By.xpath("//input[@name='password']")).clear();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	
	}catch(Exception e)
	{
		
	}
	
}
}
}
