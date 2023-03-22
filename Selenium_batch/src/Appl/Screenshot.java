package Appl;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
		
		  ChromeOptions option = new ChromeOptions();
          option.addArguments("--remote-allow-origins=*");

         // WebDriver.ChromeDriver().setup();
      //    driver= new ChromeDriver(option);
		
        WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(3000);
        TakesScreenshot t=(TakesScreenshot )driver;
        //Visible area of application in the browser
       for(int i=1;i<=4;i++)
       {
        File src= t.getScreenshotAs(OutputType.FILE);
        
        Random rand = new Random();
        
        int rand_int1 = rand.nextInt(1000);
        
        File dest=new File("C:\\Users\\Rita\\Pictures\\Screenshots\\practice\\Test"+i+ rand_int1+".jpg");
        
        FileHandler.copy(src, dest);
       }
        
        
        
        
}
}