package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaScriptEx {
	WebDriver driver;

	
	@BeforeClass
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}
	
	@Test (priority=1)  //(dependsOnMethods= {"setUp"})
	void action() {
		WebElement female=driver.findElement(By.xpath("//input[@id='female']"));
		WebElement name=driver.findElement(By.xpath("//input[@placeholder='Enter Name']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", female);
		js.executeScript("arguments[0].setAttribute('value', 'Welcome to Ekshiv')", name);
	}
	
	@Test (priority=2)
	void scrollPage() {
		WebElement uploadScroll=driver.findElement(By.id("singleFileInput"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", uploadScroll);
	}
	
	@AfterClass
	void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	

}






