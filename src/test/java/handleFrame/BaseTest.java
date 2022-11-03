package handleFrame;
//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest{
	
	WebDriver driver;
	
	//pre condition 
	
	@BeforeMethod
	public void launchapp() {
		System.out.println("Lanuching Application..");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");;
		
	}
	@AfterTest
	public void closingapp() throws Exception{
		
		Thread.sleep(5000);
		driver.close();
		System.out.println("Closing application..");
				
					
	}
	
	
	
}