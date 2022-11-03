package exercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import exercise.ReadConfig;

//import junit.framework.Assert;

public class AmazonTest2 {

	WebDriver driver;

	@Test
	public void verifySearchTest() throws Exception {

		// application URL
		// browser

		// create an object
		ReadConfig conf = new ReadConfig();
		String browser = conf.getBrowser();
		String URL = conf.getAppURL();

		System.out.println("Application URL : " + URL + " and browser details are: " + browser);

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Act\\Downloads\\chromedriver_win32_106\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		// WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();

		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\Act\\Downloads\\edgedriver_win64_106\\msedgedriver.exe");
		// WebDriver driver = new EdgeDriver();

		// WebDriverManager.edgedriver().setup();
		// WebDriver driver = new EdgeDriver();

		// cross browser testing

		if (browser.equalsIgnoreCase("CHROME")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		else {

			// default browser

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();

		driver.get(URL);

		Thread.sleep(5000);

		// locator - id

		String searchItem = "iphone 14";

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchItem);

		driver.findElement(By.id("nav-search-submit-button")).click();

		Thread.sleep(5000);

		String actualTitle = driver.getTitle();
		System.out.println("Title :" + actualTitle);

		Assert.assertTrue(actualTitle.contains(searchItem));
		Assert.assertEquals("Amazon.in : iphone 14", actualTitle);
		Assert.assertEquals("Amazon.in : " + searchItem, actualTitle);

		Thread.sleep(5000);

		driver.close();
	}

}
