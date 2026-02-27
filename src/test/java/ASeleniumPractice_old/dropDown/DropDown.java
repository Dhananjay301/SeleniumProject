package ASeleniumPractice_old.dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		find select tag and capture webelemnt
		
		WebElement dropDown=driver.findElement(By.cssSelector("#country"));
		
		Select sel=new Select(dropDown);
		
		sel.selectByVisibleText("Canada");
		Thread.sleep(1000);
		
		sel.selectByValue("germany");
		Thread.sleep(1000);
		
		sel.selectByIndex(5);
		
		List<WebElement> list=sel.getOptions();  // to get all options
		for(WebElement allList: list) {
			System.out.println(allList.getText());
		}
		

	}

}




