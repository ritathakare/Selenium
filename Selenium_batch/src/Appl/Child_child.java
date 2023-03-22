package Appl;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_child {
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		WebElement alertbox=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		
		
	//WebElement confirmbox=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
	//WebElement promptbox=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
	//WebElement linkbreak=driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
	
		
		Thread.sleep(5000);
		alertbox.click();
		
	 	String mainpage=driver.getWindowHandle();
	    System.out.println(mainpage);
	    Set<String> a=driver.getWindowHandles();
		ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
		String a1=addr.get(1);
		driver.switchTo().window(a1);
		Thread.sleep(5000);
		WebElement getyour=driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
		getyour.click();
	    addr=new ArrayList<String>(driver.getWindowHandles());
	    String a2=addr.get(2);
	    driver.switchTo().window(a2);
	    System.out.println(driver.getCurrentUrl());
		System.out.println(a2);
	    String a3=addr.get(1);
	    driver.switchTo().window(a3);
		System.out.println(driver.getCurrentUrl());
		System.out.println(a3);
		
}
}