package Appl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Healthcare {
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hcgoncology.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='kenytChatWindow']"));
		driver.switchTo().frame(frame);
		
		WebElement closeWindow = driver.findElement(By.xpath("//div[@id='headerCloseButton']//span"));
		closeWindow.click();
       
//       WebElement location=driver.findElement(By.xpath("//select[@id='widget_location']//option[1]"));
//       	location.click();
	}
}
