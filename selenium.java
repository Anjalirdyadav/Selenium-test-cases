
package sele.case2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SeleCase2 {

     WebDriver driver;
    public void openbrower()
    {
          System.setProperty("webdriver.chrome.driver", "chrom driver path");
        driver = new ChromeDriver();
        driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
        driver.switchTo().defaultContent();
       //driver.findElement(By.xpath("//*[@id='language']/div/div[1]/span/span[1]/span[2]")).sendKeys("English");
       driver.findElement(By.id("name")).sendKeys("test case2");
       driver.findElement(By.id("orgName")).sendKeys("test case2");
       driver.findElement(By.id("singUpEmail")).sendKeys("mail@gmail.com");
       WebElement chkbox = driver.findElement(By.className("ng-untouched ng-valid ng-dirty ng-valid-parse ng-empty"));
       chkbox.click();
       // sign to gmail not allowed via selenium
       driver.navigate().to("https://accounts.google.com/signin");
       driver.findElement(By.name("identifier")).sendKeys("mail@gmail.com");
       driver.findElement(By.className("VfPpkd-LgbsSe")).click();
       driver.findElement(By.name("password")).sendKeys("abc@1234");
       driver.findElement(By.xpath("//label[text()='I agree to the Terms and Conditions']")).click();
       driver.findElement(By.id("identifierId")).sendKeys("mail@gmail.com");
       driver.findElement(By.className("VfPpkd-LgbsSe")).click();
       
    }
          
    public static void main(String[] args) {
      SeleCase2 sc = new SeleCase2();
      sc.openbrower();      
    }
    
}
 