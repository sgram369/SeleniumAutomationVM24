package handleFrame;

//import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleWatchVideo_PayTM extends BaseTest {

  @Test
  public void verifyDropdownMult() throws Exception {

      WebElement signIn = driver.findElement(By.xpath("//span[contains(text(),'Sign')]"));
      signIn.click();
      
      Thread.sleep(5000);
      
      
      //SwitchTo  ------ alert/window/frame
      //driver.switchTo()
      
      //frame
      //handle frame
      
      //index   -   start from 0
      //driver.switchTo().frame(0);
      
//    driver.switchTo().frame("name/id");
      
      //driver.switchTo().frame(WebElement);
      WebElement myFrame =driver.findElement(By.xpath("//iframe[contains(@src, 'login')]"));
      driver.switchTo().frame(myFrame);
      
      
      
      
      WebElement watchVideo = driver.findElement(By.xpath("//span[contains(text(),'Watch Video')]"));
      watchVideo.click();
      
      String actualHeading = driver.findElement(By.cssSelector(".heading")).getText();
      System.out.println(actualHeading);
      
      Assert.assertTrue(actualHeading.contains("Paytm Web account"));
          
  }

}