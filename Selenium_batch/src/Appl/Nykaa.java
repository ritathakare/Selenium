package Appl;
//Rita
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nykaa {
	public static void main(String[] args)throws InterruptedException  {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
				
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.nykaa.com/");
	driver.manage().window().maximize();
	
	WebElement logo=driver.findElement(By.xpath("//a[@title='logo']"));
	logo.click();
    WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']"));
    search.click();	
    WebElement cosmetics=driver.findElement(By.xpath("//div[@class='css-6cdipv']//li[1]"));
    

    Actions act=new Actions(driver);
    act.moveToElement(cosmetics).perform();
    act.click().perform();
  
    WebElement coverage=driver.findElement(By.xpath("(//div[@class='filter-action'])[10]"));
    coverage.click();
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView(true);",coverage);
   
    js.executeScript("window.scrollBy(0,-100)");
    
    WebElement check=driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]"));
    check.click();
                                        //on which browser you want to apply the wait
  // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
    
 
   WebElement shades=driver.findElement((By.xpath("(//button[@type='button'])[3]")));
   shades.click();
  
   WebElement pinkshade=driver.findElement(By.xpath("//div[@id='custom-scroll']//span[1]"));
   pinkshade.click();
   
//   WebElement view=driver.findElement(By.xpath("(//div[@class='css-1hd8apt'])[1]//button[1]"));
//   view.click();
   
//   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
   
//     Thread.sleep(8000);
    
//     WebElement bag=driver.findElement(By.xpath("//div[@class='css-hx8d3x']//div//button//span"));
//     bag.click();

      WebElement luxe=driver.findElement(By.xpath("//a[text()='luxe']"));
      WebElement fragrance=driver.findElement(By.xpath("(//a[text()='Fragrance'])[1]"));
   
       Actions act1=new Actions(driver);
       act1.moveToElement(luxe).perform();
       act1.moveToElement(fragrance).perform();
       act1.click().build().perform();
//     
//       WebElement fragrancefamily=
//       driver.findElement(By.xpath("(//div[@class='filter-open css-1kwl9pj'])[7]//div[1]//div"));
//       fragrancefamily.click();
//     
//     WebElement floral=driver.findElement(By.xpath("//div[@class='css-1ago99h']//div[2]//div[2]"));
//     floral.click();
//    
// WebElement perfume = driver.findElement(By.xpath("(//div[@class='product-listing']//div[2])[1]"));
// perfume.click();
//
    JavascriptExecutor j=(JavascriptExecutor)driver;
//    j.executeScript("arguments[0].scrollIntoView(true);",fragrancefamily);
    j.executeScript("window.scrollBy(0,-100)");
    
    Thread.sleep(2000);
    
    WebElement store_Events=driver.findElement(By.xpath("((//div[@id='offer-banner'])[2]//a)[3]"));
    store_Events .click();
//  WebElement city = driver.findElement(By.xpath("(//input[@id='nw-store-search'])[1]")); 
//  city.click();
    
  
   
}
}