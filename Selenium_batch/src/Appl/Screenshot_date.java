package Appl;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_date {
	
	public static void main(String[] args) throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver ","C:\\Users\\Rita\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
		
		 ChromeOptions option = new ChromeOptions();
         option.addArguments("--remote-allow-origins=*");
	
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/login/");
	
        TakesScreenshot takesScreenshot =(TakesScreenshot )driver;
       
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
        	  
        Date date = new Date();  
        
        String timeStamp = formatter.format(date);

        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        
        File dest = new File("C:\\Users\\Rita\\Pictures\\Screenshots\\practice\\Test"+timeStamp+".jpeg");
        
        FileHandler.copy(src, dest);
        
        driver.quit();
	}
}
