package ASeleniumPractice_old.listners;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCaseLogin {
	WebDriver driver;

	@Test(priority=0)
	void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	@Test (priority=1)
	void userLogin() throws InterruptedException {
		WebElement uname=driver.findElement(By.cssSelector("#user-name"));
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		
		uname.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
			
	}
	
	@Test (priority=2)
	void verifyTitle() {
		String title=driver.getTitle();
		System.out.println("title=== "+title);
		Assert.assertEquals(title, "Swag Labs");
	}
	
	@Test (priority=3, dependsOnMethods= {"verifyTitle"})
	void verifyProductDisplayed() {
		WebElement product=driver.findElement(By.xpath("//div[@class='product_label']"));
		boolean flag=product.isDisplayed();
		System.out.println("flag== "+flag);
		Assert.assertTrue(flag);
	}
	


}











