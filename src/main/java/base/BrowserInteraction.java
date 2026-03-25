package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserInteraction {
static WebDriver driver;
static WebElement webElement;

    public void startBrowser(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    protected static void navigate(String url){
        driver.get(url);
    }

    public void closeBrowser() {
        driver.quit();
    }
    protected void enterUsername(String uname, String userLoc){
        driver.findElement(By.cssSelector(userLoc)).sendKeys(uname);
    }
}
