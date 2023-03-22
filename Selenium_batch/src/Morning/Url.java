package Morning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//Thread.sleep(5000);//delay 5000 ms=5sec
	//	String url=driver.getCurrentUrl();
		
	//	System.out.println(url);
		
	//	String title=driver.getTitle();
	//	System.out.println(title);
}
}