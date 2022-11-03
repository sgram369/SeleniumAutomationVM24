package javascriptExample;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

//import utility.ReadConfig;

public class BaseTest {

	WebDriver driver;

	//ReadConfig conf;

	@BeforeTest

	public void launchApp() throws Exception {

		System.out.println("launching app....");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// implicit delay

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //maximum
		// time......any element

		// create an object

		//conf = new ReadConfig();

		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// driver.get("https://www.amazon.in/");

		driver.get("https://www.myntra.com/");

	}

	@AfterTest

	public void closingApp() throws Exception {

		Thread.sleep(5000);

		driver.close();

		System.out.println("closing app....");

	}

}
