package Appl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		WebElement fashion=driver.findElement(By.xpath("//a[text()='Fashion']"));
		fashion.click();
	    WebElement womenfashion=driver.findElement(By.xpath("(//div[@class='sl-sobe-carousel-sub-card-footer'])[3]"));
	    womenfashion.click();
	    Thread.sleep(5000);
	    WebElement check=driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox'])[1]"));
	    
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
	    	check.click();
	    }
	    result=check.isSelected();
	    System.out.println(result);
	    
	    
}
}