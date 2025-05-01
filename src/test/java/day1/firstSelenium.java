package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstSelenium {

	public static void main(String[] args) throws InterruptedException {

//Launch browser
		
		ChromeDriver driver=new ChromeDriver();
		
//		open url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		Maximize size
		driver.manage().window().maximize();
		
//		Title of page
		
		String title=driver.getTitle();
		System.out.println("Title= "+title);
		
////		page source
//		String pageSource=driver.getPageSource();
//		System.out.println("page source= "+pageSource);
		
////		close driver
//		driver.close();
		Thread.sleep(2000);
		
//		Name locator
		WebElement wl=driver.findElement(By.name("password"));
		boolean flag=wl.isDisplayed();
		System.out.println("is name displaye= "+flag);
		wl.sendKeys("password");
		
//		Css selector
		
		WebElement password=driver.findElement(By.cssSelector("input.oxd-input[name='username']"));
		password.sendKeys("DHANANAJAY");
		
	}

}
