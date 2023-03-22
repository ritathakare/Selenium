package Appl;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Axis {
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	//Thread.sleep(4000);
	
	driver.get("https://www.axisbank.com/");
	
    driver.manage().window().maximize();
	WebElement closepopup=driver.findElement(By.xpath("//div[@class='close_button'][1]"));
	closepopup.click();
	
	WebElement loan=driver.findElement(By.xpath("(//div[@class='productBox'])[4]"));
    loan.click();
	
	driver.navigate().back();
	
	WebElement close=driver.findElement(By.xpath("//div[@class='close_button'][1]"));
	close.click();
	
	
	WebElement deals=driver.findElement(By.xpath("(//a[text()='Grab Deals'])[1]"));
	deals.click();
	
	Actions act=new Actions(driver);
//	act.moveToElement(deals).perform();
	act.click().build().perform();
	
//	WebElement internetbanking=driver.findElement(By.xpath("(//div[@class='channelSec'])[3]//div[3]"));
//	internetbanking.click();
	
	WebElement creditcard = driver.findElement(By.xpath("(//div[@class='bankingChannelBlock'])[1]//a"));
	creditcard.click();
	
//	WebElement trvel=driver.findElement(By.xpath("(//div[contains(@class,'accordianBox')]//div)[10]"));
//	trvel.click();

	
	 JavascriptExecutor js =(JavascriptExecutor)driver;
//	 js.executeScript("arguments[0].scrollIntoView(true);",trvel);
	 js.executeScript("window.scrollBy(0,-100)");
	 
	 WebElement contactus=driver.findElement(By.xpath("((//div[@class='col-md-12'])[6]//a)[1]"));
	 contactus.click();
	
     WebElement branches = driver.findElement(By.xpath("(//div[@class='locateUs comBox']//li)[1]"));
	 branches.click();
	
//	 WebElement search = driver.findElement(By.xpath("//select[@id='customState']"));
//	 search.sendKeys("Jalgaon");
//	 search.click();
	
	 WebElement state=driver.findElement(By.xpath("//select[@id='customState']"));
	 state.click();
	

	
	
	
	
	
	
	
}
}