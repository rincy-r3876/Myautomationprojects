package testnng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myfitnesspal {
	ChromeDriver driver;
	@BeforeTest
	public void step1()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void step2()
	{
		driver.get("https://www.myfitnesspal.com/");
	}
	//Title verification
	@Test (priority = 1)
	public void step3()
	{
	String actualtitle=driver.getTitle();
	String expectedtitle="#1 nutrition tracking app";
	if(actualtitle.equals(expectedtitle))
	{
		System.out.println("Titles are same");
	}
	else
	{
		System.out.println("Titles are not same");
	}
	}
	//Sign Up
	@Test(priority = 2)
	public void step4()
	{
		
	//locating button
		try {
			
		// cookie manager ok code
		driver.findElement(By.xpath("/html/body/div[2]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/main/p/a")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\":r6:\"]")).sendKeys("Rincy"); //first name
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/main/div/form/div/nav/div/button")).click(); //next
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/main/div/form/div/div/div[2]/div/button[5]/p")).click(); //modify my diet
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/main/div/form/div/nav/div/button/p")).click(); //next
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/main/div/form/nav/div/button")).click(); //next
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/main/div/form/div/div[2]/div/button[5]/p")).click(); //less sugar
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/main/div/form/div/div[2]/div/button[12]/p")).click(); //more fruits and veg
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/main/div/form/nav/div/button")).click(); //next
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/main/div/form/nav/div/button/p")).click(); //next
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/main/div/form/div/div[2]/div/button[2]/div/p[2]")).click(); //lightly active
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/main/div/form/nav/div/button/p")).click(); //next
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/main/div/form/div/div[1]/div[2]/label[2]/span[1]/input")).click(); //female
		driver.findElement(By.xpath("/html/iframe")).click(); //IVIDE THOTT DATE PICKER CODE 
		driver.findElement(By.xpath("/html/iframe"));
		driver.findElement(By.xpath("")).click();
				
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/main/div/form/div/div[3]/div/div[1]/div/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/main/div/form/nav/div/button/p")).click(); //next
		driver.findElement(By.xpath("//*[@id=\"Height (feet)\"]")).sendKeys("5"); //height
		driver.findElement(By.xpath("//*[@id=\"Current weight\"]")).sendKeys("116"); // current weight
		driver.findElement(By.xpath("//*[@id=\"Goal weight\"]")).sendKeys("99"); //weight goal
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/main/div/form/nav/div/button")).click(); //next
		driver.findElement(By.xpath("//*[@id=\"Email address\"]")).sendKeys("rincyreji0922gmail.com"); //email
		driver.findElement(By.xpath("//*[@id=\"Create a password\"]")).sendKeys("rincy@12345"); //password
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/main/div/form/div/div[4]/label/div/span/input")).click(); //terms and conditions
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/main/div/form/div")).click(); //continue
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div/main/div/form/div/div[3]/nav/div/button/p")).click();
		
		
		
		
		
		
		}catch(Exception e) {
			
		}
		
	
	}
	
	

}
