package Morning;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowscan {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		System.out.println("Enter the data");
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		int x=s.nextInt();
		
		System.out.println(a);
		
		
		
}
}