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

public class Data3 {
	ChromeDriver driver;
	@BeforeTest
	public void abc() {
	driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	@Test
	public void abc2() throws IOException
	{
	
	FileInputStream ob=new FileInputStream("C:\\Users\\91628\\OneDrive\\Desktop\\Book1.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(ob);
	XSSFSheet sh=wb.getSheet("Sheet1");
	int rowcount=sh.getLastRowNum();
	for(int i=1;i<=rowcount;i++)
	{
		try {
	XSSFCell user=sh.getRow(i).getCell(0);
	String username=user.getStringCellValue();
	
	XSSFCell pass=sh.getRow(i).getCell(1);
	String password=pass.getStringCellValue();
	
	System.out.println("username"+username);
	System.out.println("password"+password);
	
	driver.findElement(By.name("login")).clear();
	driver.findElement(By.name("login")).sendKeys(username);
	
	driver.findElement(By.name("passwd")).clear();
	driver.findElement(By.name("passwd")).sendKeys(password);
	
	driver.findElement(By.name("proceed")).click();}
	catch(Exception e)
	{
		
	}
	
	}}}


