package Appl;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri {
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		
 WebElement jobs=driver.findElement(By.xpath("//a[@title='Firstnaukri | Search Jobs']"));
	 Actions act=new Actions(driver);
	 act.moveToElement(jobs);
	 act.click().build().perform();
	 
	 driver.navigate().back();
	  
 WebElement register=driver.findElement(By.xpath("//a[text()='Register for free']"));
 register.click();
		
 WebElement fullname=driver.findElement(By.xpath("//input[@type='text']"));
 fullname.sendKeys("asfdgfhgg");

 WebElement email=driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
 WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	email.sendKeys("adfhhk@gmail.com");
	password.sendKeys("sg134@gh");
	
 WebElement check=driver.findElement(By.xpath("//img[@id='tncFlag']"));
 WebElement registernow=driver.findElement(By.xpath("//button[text()='Register now']"));
		
      Thread.sleep(5000);
		boolean result=check.isSelected();
		if(result==true)
		{
		System.out.println(result);	
		System.out.println("Selected");
		
		}
		else
		{
			System.out.println(result);	
			System.out.println("Not Selected");	
			
		}
		result=check.isSelected();
		System.out.println(result);
		registernow.click();
		
	    driver.navigate().back();
	
  WebElement resumemaker =driver.findElement(By.xpath("//div[text()='Resume Maker']"));
	resumemaker.click();
	
  WebElement createresume=driver.findElement(By.xpath("//a[text()='Create resume now!']"));
    createresume.click();
   
//	WebElement popup=driver.findElement(By.xpath("//div[@id='regLayerModal']//div[3]"));
//	popup.click();
	
	WebElement emailid=driver.findElement(By.xpath("[@id='email']"));
	emailid.sendKeys("thakare@gmail.com");
	
	WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
	pass.sendKeys("gavsgdyu732@");
	
	WebElement createaccount=driver.findElement(By.xpath("//button[text()='Create account']"));
	createaccount.click();
	
	}
}




//WebElement education=driver.findElement(By.xpath("//p[text()='Education details']"));
//WebElement basicdetails=driver.findElement(By.xpath("//p[text()='Basic details']"));
//education.click();
//basicdetails.click();