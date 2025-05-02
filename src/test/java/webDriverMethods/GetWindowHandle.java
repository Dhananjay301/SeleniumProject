package webDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {

		System.out.println("Start Script");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		
		WebElement newWin=driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
		newWin.click();
		
//		single window handle 
		String winHandle=driver.getWindowHandle();
		System.out.println("winHandle= "+winHandle);
		
////		multiple win handles
		Set<String> winHandles=driver.getWindowHandles();
//		System.out.println("winHandles= "+winHandles);
		
//		appraoch 2 for each loop
		String exptTitle="Human Resources Management Software | OrangeHRM HR Software";
		for (String str: winHandles) {
			
			driver.switchTo().window(str);
			String actTitle=driver.getTitle();
			System.out.println("actTitle= "+actTitle);
			
			if(exptTitle.equals(actTitle)) {
				System.out.println(driver.getTitle());
				System.out.println("Inside window");
				break;
			}
		}
		
		System.out.println("end script");

	}

}











