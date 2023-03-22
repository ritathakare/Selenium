package Appl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
	WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
	search.click();
	search.sendKeys("Music");
	search.click();
	WebElement music=driver.findElement(By.xpath("//input[@id='search']"));
	music.click();
	
	//Thread.sleep(3000);
	WebElement shorts=driver.findElement(By.xpath("(//a[@id='endpoint'])[1][1]"));
	shorts.click();
	
	
}
}