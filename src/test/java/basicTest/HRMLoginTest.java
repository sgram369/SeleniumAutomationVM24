

package basicTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import junit.framework.Assert;

public class HRMLoginTest {

    
    @SuppressWarnings("deprecation")
	@Test
    public void verifyLogin() throws Exception {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");   
                        
        
        //Identification
//      
//      id
//      name
//      className
//      tagname
//
//      linkText
//      partialLinkText
//
//                  condition (both)
//
//                      tagname: a
//                      text: 
//
//      XPATH
//      CSS Selector
        
        
        
        //locator - name
        
        Thread.sleep(4000);
        String actualTitle  = driver.getTitle();
        String actualUrl = driver.getCurrentUrl();
        
        
        
        
        WebElement txt_UserName = driver.findElement(By.name("username"));
        
        txt_UserName.click();
        txt_UserName.sendKeys("Admin");
        System.out.println(txt_UserName.getTagName());
        
        
        
        //enter value in password field
        driver.findElement(By.name("password")).sendKeys("admin123");
        
        
        //click on login button
        
        driver.findElement(By.tagName("button")).click();
        
        
        Thread.sleep(5000);
        
        System.out.println("Actualurl: "+ actualUrl);
        Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList",actualUrl );
        
        //Validate PIM
        String actual_PIMLabel = driver.findElement(By.tagName("h6")).getText();
        Assert.assertEquals("PIM", actual_PIMLabel);
        
        
        //dropdown elementoxd-icon bi-caret-down-fill oxd-userdropdown-icon
        driver.findElement(By.className("oxd-userdropdown-name")).click();
        
        Thread.sleep(5000);
        boolean isLoginButtonAvailable = driver.findElement(By.tagName("button")).isDisplayed();
        Assert.assertEquals(true, isLoginButtonAvailable);
        
        
        
        driver.findElement(By.linkText("Logout")).click();
      
        
        //driver.close();
        
    }
    
    
    
}
