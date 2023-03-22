package Appl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3school {
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//To handle alert popup
		WebElement submit= driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		Thread.sleep(3000);
	//	WebElement t=driver.findElement(By.xpath("//a[text()='Telecom Project']"));
//here it gives unhandeled alert exception by 
//clicking on main page element without handling alert_popoup
		
		Alert alt=driver.switchTo().alert();
	//alt.accept();/*To click on ok/yes/accept*/
	// alt.sendKeys("abcd");
	    String text=alt.getText();
	    System.out.println(text);
	     alt.dismiss();/*To click on no/cancel/deny*/
	 //or we do method chaining here  
	     driver.switchTo().alert().accept();
	  
     }
}		








//		driver.get("https://www.w3schools.com/");
//		Thread.sleep(3000);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,3000)");
//		js.executeScript("window.scrollBy(0,-2000)");
//		js.executeScript("window.scrollBy(2000,0)");
//		js.executeScript("window.scrollBy(-2000,0)");
				
