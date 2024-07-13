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

public class Shoekart {
ChromeDriver driver;
@BeforeTest
public void abc()
{
driver=new ChromeDriver();
driver.get("https://www.shoe-kart.com/customer/account/login/");
}
@Test
public void cba() throws IOException
{
FileInputStream ob=new FileInputStream("C:\\Users\\91628\\OneDrive\\Desktop\\Book1.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(ob);
XSSFSheet sh=wb.getSheet("Sheet1");

int rowcount=sh.getLastRowNum();
for(int i=1;i<=rowcount;i++)
{
try {
	XSSFCell email=sh.getRow(i).getCell(0);
	String emailid=email.getStringCellValue();
	
	XSSFCell pass=sh.getRow(i).getCell(1);
	String password=pass.getStringCellValue();
	
	System.out.println("emailid"+emailid);
	System.out.println("password"+password);
	
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("email")).sendKeys(emailid);
	
	driver.findElement(By.id("pass")).clear();
	driver.findElement(By.id("pass")).sendKeys(password);
	
	driver.findElement(By.xpath("//*[@id=\"send2\"]/span/span")).click();
}
	
	
	

	
	
	
	catch(Exception e)
{
	

}
}
}
}
