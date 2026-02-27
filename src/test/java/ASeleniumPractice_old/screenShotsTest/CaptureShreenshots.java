package ASeleniumPractice_old.screenShotsTest;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CaptureShreenshots {

	WebDriver driver;

		@BeforeClass
		void setUp() {
			driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/v1/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
		@Test (priority=0)
		void fullCaptureScreen() {
			TakesScreenshot ts=(TakesScreenshot) driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			
			File target=new File(System.getProperty("user.dir")+"\\screenShots\\fullPage.png");
			source.renameTo(target);
		}
		
		@Test (priority=1)
		void specificWeb() {
			File specific=driver.findElement(By.id("login-button")).getScreenshotAs(OutputType.FILE);
			File loginButtonScreen=new File(System.getProperty("user.dir")+"\\screenShots\\loginButton.png");
			specific.renameTo(loginButtonScreen);
		}

}












