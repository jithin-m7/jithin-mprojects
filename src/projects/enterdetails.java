package projects;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enterdetails {
	ChromeDriver driver;
	@Before
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	}
	
	@Test
	public void test()
	{
		
	       
		driver.findElement(By.name("firstname")).click();
		driver.findElement(By.name("firstname")).sendKeys("JITHIN");

		driver.findElement(By.name("lastname")).click();
		driver.findElement(By.name("lastname")).sendKeys("Wood");

		driver.findElement(By.id("sex-0")).click();

		driver.findElement(By.id("exp-4")).click();
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.id("datepicker")).sendKeys("16-10-2020");
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-2")).click();
		driver.findElement(By.id("continents")).click();
		WebElement dropdown = driver.findElement(By.id("continents"));
		dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();
		WebElement dropdown1 = driver.findElement(By.id("selenium_commands"));
		dropdown1.findElement(By.xpath("//option[. = 'Browser Commands']")).click();


 


		driver.findElement(By.id("submit")).click();

	        

 
	    
	      
	        
	  }

}
