package webDriverMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCmds {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.google.co.in/");
		String title=driver.getTitle();
		System.out.println("second title= "+title);
		
		driver.navigate().back();
		String orgTitle=driver.getTitle();
		System.out.println("first title= "+orgTitle);
		
		driver.navigate().forward();
		String title2=driver.getTitle();
		System.out.println("second title= "+title2);
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		driver.close();
		

	}

}
