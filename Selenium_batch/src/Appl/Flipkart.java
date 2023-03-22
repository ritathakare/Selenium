package Appl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement popup=driver.findElement(By.xpath("//button[contains(@class='_2KpZ6l')]"));
		popup.click();
	//	driver.close();
		Thread.sleep(3000);
		
		WebElement Mobiles=driver.findElement(By.xpath("//div[text()='Mobiles & Tablets']"));
		Mobiles.click();
		
	}

}
