package yogaClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class YogaClasswithOmnify {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rita\\Documents\\chromedriver_win32 (2)\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver(options);
			driver.get("https://app.getomnify.com/web/login/verify/7lhEOe0M2T9gwcZci3cdMLRNwf7xq2EW?expires=1680166852&signature=3d39f5042749c9d58d2df1f9b21aff3bc92db21457d83cc89d67a7cd8065cd7b"); // 
			
			driver.manage().window().maximize();
			
			// Automation started 
			WebElement services = driver.findElement(By.xpath("(//a[@class = 'main-navigation-link w-inline-block '])[4]"));
			services.click();
			
			Actions act = new Actions(driver);
			
			WebElement classes = driver.findElement(By.xpath("//div[text() = 'Classes']"));
			act.moveToElement(classes).click().build().perform();
			
			//p[text() = 'Create a Service']
			WebElement createService = driver.findElement(By.xpath("//p[text() = 'Create a Service']"));
			createService.click();
			
			// (//div[@id = 'w-node-_495ca9f4-1ca3-0e11-655b-6680e5e680e0-84f26036']//div)[3]
			WebElement createClass = driver.findElement(By.xpath("(//div[@id = 'w-node-_495ca9f4-1ca3-0e11-655b-6680e5e680e0-84f26036']//div)[3]"));
			createClass.click();
			
			Boolean classtitle = driver.findElement(By.xpath("//input[@id = 'title']")).isEnabled();
			
			if(classtitle == true)
			{
				System.out.println("Class title is enabled");
			}
			else {
				System.out.println("Class title is disabled");
			}
			
			WebElement classtitlename = driver.findElement(By.xpath("//input[@id = 'title']")); 
			classtitlename.sendKeys("Yoga class with Omnify");
			
			//xpath for description box

			WebElement descriptionbox =driver.findElement(By.xpath("//div[@class='ql-editor qlblank']"));
			boolean d = descriptionbox.isDisplayed();
			if(d == true)
			{
			System.out.println("descriptionbox is displayed");
			}
			else
			{
			System.out.println("descriptionbox is not displayed");
			}

			WebElement class_color = driver.findElement(By.xpath("(//div[@id='color']//div)[3]"));
			boolean color = class_color.isSelected();
			if(color == true)
			{
			System.out.println("class_color is selected");

			}
			else
			{
			System.out.println("class_color is not selected");
			}

			WebElement selectcolor_blue = driver.findElement(By.xpath("(//div[@id='color']//div[21]"));
			selectcolor_blue.click();

			WebElement upload_image = driver.findElement(By.xpath("//div[@id='img-upload']"));
			upload_image.click();

			WebElement  Choose_File =driver.findElement(By.xpath("//div[@class='modalwrapper']//input"));
			Choose_File.click();

			WebElement upload_button = driver.findElement(By.xpath("//button[text()='Upload']"));

			boolean result = upload_button.isEnabled();
			if(result == true)
			{
			 System.out.println("Button is enabled");
			  upload_button.click();
			}
			else
			{
			System.out.println("Button is disabled");
			}
			WebElement location = driver.findElement(By.xpath("(//div[text()='In-person'])[2]"));
			location.click();
			
			WebElement address = driver.findElement(By.xpath("//input[@placeholder='Add Address']"));
			address.sendKeys("123 Main Street, hinjewadi, Pune");
			
			WebElement Trainer = driver.findElement(By.xpath("(//mat-icon[@aria-hidden='true'])[2]"));
			Trainer.click();
			
			WebElement AddTrainer = driver.findElement(By.xpath("(//div[@class='location-item-wrapper in-list'])[1]"));
			AddTrainer.sendKeys("lisa");
			
			WebElement serviceType = driver.findElement(By.xpath("//mat-label[text()='Service type']"));
			serviceType.click();
			
			WebElement paid = driver.findElement(By.xpath("//div[text()='Paid']"));
			WebElement free = driver.findElement(By.xpath("//div[text()='free']"));
			
					if (serviceType.getText().equals("Free")) {
			          //  freeOption.click();
			        } else {
			         //   paidOption.click();
			        }

		}

	}
