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

public class AdminDemo_CSS {

	WebDriver driver;

	@Test
	public void verifySearchTest() throws Exception {

		// application URL
		// browser

		// create an object
		ReadConfig conf = new ReadConfig();
		String browser = conf.getBrowser();
		String URL = conf.getAppURLAdmin();

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

		//String searchItem = "iphone 14";
//		driver.findElement(By.xpath("//*[@id=\"Email\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("admin@yourstore.com");
//		driver.findElement(By.xpath("//*[@id=\"Password\"]")).clear();
//		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Password");
//		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
//	
		
		driver.findElement(By.cssSelector("input#Email")).clear();
		driver.findElement(By.cssSelector("input#Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.cssSelector("input#Password")).clear();
		driver.findElement(By.cssSelector("input#Password")).sendKeys("Password");
		System.out.println("Username/password entered");
		//driver.findElement(By.className("button-1 login-button")).click();
		driver.findElement(By.cssSelector("button[class*='login']")).click();
		Thread.sleep(5000);
		
		

		//driver.close();
	}

}
