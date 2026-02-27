package ASeleniumPractice_old.webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
//		get()
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);

//		getTitle
		String title=driver.getTitle();
		System.out.println("Titile= "+title);
		
//		Current url
		String currentUrl=driver.getCurrentUrl();
		System.out.println("currentUrl = "+currentUrl);
		
////		getPageSource
//		String pageSource=driver.getPageSource();
//		System.out.println("pageSource = "+pageSource);
		
//		getWindowHandle
		String windowHandle=driver.getWindowHandle();
		System.out.println("windowHandle= "+windowHandle);
		
//		getWindow handles with single window
		Set<String> windowHandles= driver.getWindowHandles();
		System.out.println("windowHandles= "+windowHandles);
		
//		getWindow handles with two window
		WebElement clickWindow=driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
		clickWindow.click();
		Thread.sleep(5000);
		Set<String> setWindowHandles=driver.getWindowHandles();
		System.out.println("setWindowHandles "+setWindowHandles);
		

		
		System.out.println("Passed");
	}

}
