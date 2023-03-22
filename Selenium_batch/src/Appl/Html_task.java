package Appl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_task {
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	 List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
	
	 int size =rows.size();
	 System.out.println(size);
	
	 for(int j=2;j<rows.size();j++)
	{
		List<WebElement> cells=driver.findElements(By.xpath("//table[@id='customers']//tr["+j+"]//td"));
		for(int i=0;i<cells.size();i++)
		{
		String text=cells.get(i).getText();
		System.out.print(text+",");
	    }
		System.out.println();
	}
  
  }
}