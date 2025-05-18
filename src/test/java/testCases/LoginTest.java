package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.LoginPage;

public class LoginTest {
	WebDriver driver;
	LoginPage loginPage;

	@BeforeMethod
	public void setup() {

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();

		loginPage = new LoginPage(driver);
	}

	@Test
	public void verifyLoginWithValidCredentials() {
		loginPage.login("standard_user", "secret_sauce");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title=driver.getTitle();
		System.out.println("title=== "+title);
		String expectedTitle="Swag Labs";
		Assert.assertEquals(title, expectedTitle);	
		
//		Verify product is displayed
		boolean status=driver.findElement(By.className("product_label")).isDisplayed();
		Assert.assertTrue(status);
		System.out.println(status);
		
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
