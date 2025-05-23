package testNG_Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;


public class DataProviderTest {

	WebDriver driver;
	
	@Test(dataProvider="Datadrive", priority=0)
	void loginCases(String username, String password) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		WebElement uname=driver.findElement(By.cssSelector("#user-name"));
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		
		uname.sendKeys(username);
		pass.sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
			
	}
	
	@DataProvider(name="Datadrive")
	public Object [][] getData(){
		Object [][] data= { {"standard_user","secret_sauce"}, {"performance_glitch_user","secret_sauce"} };
		return data;
	}
	
	@AfterTest
	void tearDown() {
		driver.quit();
	}

	
	
	
}


