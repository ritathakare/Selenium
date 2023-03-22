package Appl;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {
	public static void main(String[] args) throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
        TakesScreenshot takesScreenshot =(TakesScreenshot )driver;
  
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
       
        File dest = new File("C:\\Users\\Rita\\Pictures\\Screenshots\\Test.png");
        
        FileUtils.copyFile(src, dest);
		Thread.sleep(3000);

}
}