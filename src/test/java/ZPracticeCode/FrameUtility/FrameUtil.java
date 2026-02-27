package ZPracticeCode.FrameUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FrameUtil {
    WebDriver driver;

    public void switchToFrame(String frameName,String xPath){
         driver.switchTo().frame(frameName);
        WebElement text=driver.findElement(By.xpath(xPath));
        String getText=text.getText();
        boolean flag=text.isDisplayed();
        Assert.assertEquals(true,flag);
        System.out.println("getText "+getText);

    }
    public FrameUtil(WebDriver driver){
        this.driver=driver;
    }
}
