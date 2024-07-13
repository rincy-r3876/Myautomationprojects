package testnng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Data {
	ChromeDriver driver;
	@BeforeTest
	public void before()
	{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	@Test
	public void testt() throws IOException 
	{
	FileInputStream ob=new FileInputStream("C:\\Users\\91628\\OneDrive\\Desktop\\Book1.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(ob);
	XSSFSheet sh=wb.getSheet("Sheet1");
	int row=sh.getLastRowNum();
	for(int i=1;i<=row;i++)
	{
		
	try {		
		
	XSSFCell user=sh.getRow(i).getCell(0);
	String username=user.getStringCellValue();
	
	XSSFCell pass=sh.getRow(i).getCell(1);
	String password=pass.getStringCellValue();
	
	System.out.println("username"+username);
	System.out.println("password"+password);
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).clear();
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.xpath("//button[@name='login']")).click();}
	catch(Exception e)
	{
		
	}
	
	}
		
	}}
	


