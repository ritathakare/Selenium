package Appl;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");

		WebElement alertbox=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		alertbox.click();
		
		Thread.sleep(3000);
		ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles()); 
        driver.switchTo().window(addr.get(1));
        
        WebElement frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));  
       //driver.switchTo().frame(0);//index
        //driver.switchTo().frame("iframeResult");//by attribute value as string argument
        driver.switchTo().frame(frame);//by webelement i.e.reference of webelement
        WebElement tryit=driver.findElement(By.xpath("//button[text()='Try it']"));  
        tryit.click();
        Alert alt=driver.switchTo().alert();
        driver.switchTo().alert().accept();
        
        Thread.sleep(3000);
        driver.switchTo().parentFrame();
        WebElement getyour=driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
		getyour.click();
        
}
}