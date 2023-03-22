package Appl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Compare_xl {
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
     
	 String a[]= {"Alfreds Futterkiste","Maria Anders","Germany",
			      "Centro comercial Moctezuma","Francisco Chang","Mexico"
			     ,"Ernst Handel","Roland Mendel","Austria"
			     ,"Island Trading","Helen Bennett","UK"
			     ,"Laughing Bacchus Winecellars","Yoshi Tannamuri","Canada",
			      "Magazzini Alimentari Riuniti","Giovanni Rovelli","Italy"};
	       
	
	 List<WebElement> cells=driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
	 for(int i=0;i<cells.size();i++)
	{
	   String text=cells.get(i).getText();
	   System.out.print(text);
	   boolean result=text.equals(a[i]);
	    
	    if(result==true)
	    {
	      System.out.println(" Pass");
	    }
	    else
	    {
	     System.out.println(" Fail");	
	    }
	  
	  }
		

	}
}