package testnng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven1 {
	WebDriver driver;
	@BeforeTest
	public void browser()
	{
	driver=new ChromeDriver();	
	}
	@BeforeMethod
	public void website()
	{
	driver.get("https://www.facebook.com/");	
	}
	@Test
	public void test() throws IOException
	{
	FileInputStream ob=new FileInputStream("C:\\Users\\91628\\OneDrive\\Desktop\\Book1.xlsx"); //file
	XSSFWorkbook wb=new XSSFWorkbook(ob); //workbook
	XSSFSheet sh=wb.getSheet("Sheet1"); //sheet
	int rowcount=sh.getLastRowNum();
	for(int i=1;i<=rowcount;i++)
	{
	String username=sh.getRow(i).getCell(0).getStringCellValue();
	String pwsrd=sh.getRow(i).getCell(1).getStringCellValue();
	System.out.println("username"+username);
	System.out.println("pwsrd"+pwsrd);
	driver.findElement(By.id("email"));
	driver.findElement(By.id("pass"));
	driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	wb.close();
	}

}
