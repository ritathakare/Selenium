package Morning;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsersize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);//delay 3000 ms=3sec
	//how to change the size of browser 
		
		Dimension d=new Dimension(200,400);//width*height pixels
		driver.manage().window().setSize(d);

	   Thread.sleep(3000);//delay 3000 ms=3se
	   
	//how to change the position of the browser
	   
	   Point p=new Point(200,600);
	   driver.manage().window().setPosition(p);
}
}