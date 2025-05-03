package checkBoxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		select singe check box
		WebElement sundayCheck=driver.findElement(By.cssSelector("#sunday"));
		sundayCheck.click();
	
//		multiple checkbox click
//		
//		List<WebElement> mutliBox=driver.findElements(By.cssSelector(".form-check-input[type='checkbox']"));
//		
//		for (WebElement checks: mutliBox) {
//			checks.click();
//		}
		
//		If already selected then skip and select remaining
		List<WebElement> skipSelected=driver.findElements(By.cssSelector(".form-check-input[type='checkbox']"));
		
		for (WebElement checks: skipSelected) {
			if(!checks.isSelected()) {
				checks.click();
			}

		}
		
		

	}

}





