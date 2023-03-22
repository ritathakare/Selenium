package Morning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);//delay 3000 ms=3sec
		//method chaining
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//until selenium 3.141.59 we cannot minimize the browser
		//from selenium 4.0.0 we can minimize the browser by using
		
		//driver.manage().window().minimize();//version 4.0.0
		Thread.sleep(3000);
	//diff betw closed and quit method
		
		driver.close();//to closed the current tab only
		Thread.sleep(3000);
		
		driver.quit();//to closed all the tabs 
		             //OR to closed browser open by selenium
}
}