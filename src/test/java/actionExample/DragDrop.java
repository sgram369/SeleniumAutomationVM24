package actionExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {
	WebDriver driver;

	//ReadConfig conf;

	@BeforeTest

	public void launchApp() throws Exception {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

	}

	@AfterTest

	public void closingApp() throws Exception {

		Thread.sleep(5000);

		driver.close();

		System.out.println("closing app....");

	}


	@Test

	public void verifyDragandDrop() throws Exception {

		/*WebDriverWait wait = new WebDriverWait(driver, 60); // maximum time
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[contains(text(),'Tatras')]")));
		System.out.println("Wait..");*/
		Thread.sleep(15000);
		WebElement From = driver.findElement(By.xpath("//h5[text='High Tatras')]"));
		System.out.println("Source element succes ");
		WebElement To = driver.findElement(By.cssSelector("id#trash"));
		System.out.println("Target element success ");
		// rightButton.click();

		// create an object of action class

		Actions act = new Actions(driver);

		act.dragAndDrop(From, To).build().perform();

		Thread.sleep(4000);
		System.out.println("Drag and drop success");

	}	
}

