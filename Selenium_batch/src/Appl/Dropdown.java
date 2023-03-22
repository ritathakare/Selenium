package Appl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
		WebElement Password=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement Login=driver.findElement(By.xpath("//button[text()='Log in']"));
		WebElement createnewaccount=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createnewaccount.click();
	 // Thread.sleep=(3000);
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		
	//WebElement Login=driver.findElement(By.xpath("//button[text()='Log in']"));
	Select s=new Select(month);
	s.selectByIndex(4);

} 
}