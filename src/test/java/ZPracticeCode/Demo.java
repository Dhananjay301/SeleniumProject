package ZPracticeCode;

import ZPracticeCode.FrameUtility.FrameUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;

public class Demo {
    private static WebDriver driver;

    public static void main(String[] args) {
         driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.manage().window().maximize();
        FrameUtil frame=new FrameUtil(driver);
        String text="mce_0_ifr";
        String xPath="//body/p[text()='Your content goes here.']";
        frame.switchToFrame(text,xPath);

//        driver.switchTo().frame("mce_0_ifr");
//        WebElement text=driver.findElement(By.xpath("//body/p[text()='Your content goes here.']"));
//        String getText=text.getText();
//        boolean flag=text.isDisplayed();
//        Assert.assertEquals(true,flag);

//        System.out.println(getText+" "+flag);

//        driver.switchTo().defaultContent();
//        WebElement file=driver.findElement(By.xpath("//div//span[text()='File']"));
//        boolean fileName=file.isEnabled();
//        System.out.println("file= "+fileName);
//        file.click();
        driver.close();


    }
}
