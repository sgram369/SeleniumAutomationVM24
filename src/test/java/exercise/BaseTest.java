package exercise;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest{
	
	WebDriver driver;
	
	//pre condition 
	
	@Before
	public void launchapp() {
		System.out.println("Lanuching Application..");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");;
		
	}
	@After
	public void closingapp() throws Exception{
		
		Thread.sleep(5000);
		driver.close();
		System.out.println("Closing application..");
				
					
	}
	
	
	
}