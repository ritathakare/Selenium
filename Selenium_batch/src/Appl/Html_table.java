package Appl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_table{

	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
   
	List<WebElement> cells=driver.findElements(By.xpath("//table[@id='customers']//td"));
	
	int size =cells.size();//total no.of data in collection(list)
	System.out.println(size);
	
	for(int i=0;i<cells.size();i++)
	{
	String text=cells.get(i).getText();
	System.out.println(text);
	}
	
	
	
	
	
	
	//WebElement c1=cells.get(0);
	//OR
	//System.out.println(cells.get(0).getText());
	
	
	
	
}
}