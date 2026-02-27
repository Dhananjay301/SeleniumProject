package ASeleniumPractice_old.webDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		
//		isDislayed
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement logo=driver.findElement(By.cssSelector("[alt='company-branding']"));
		boolean logoDisplay=logo.isDisplayed();
		System.out.println("logo dispaled "+logoDisplay);

//		isEnabled
		
		WebElement searchBox=driver.findElement(By.cssSelector("[name='username']"));
		searchBox.sendKeys("admin");
		boolean usernameEnable=searchBox.isEnabled();
		System.out.println("username is enabled= "+usernameEnable);
		
		driver.close();

	}

}
