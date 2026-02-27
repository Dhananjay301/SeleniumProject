package ASeleniumPractice_old.keyBoardAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://textcompare.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement el=driver.findElement(By.cssSelector("[name='frm_compare_1']"));
		el.sendKeys("Welcome to Keyboard Actions");
		
		Actions act=new Actions(driver);
		
//		To select all text
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
//		Copy text
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
//		press tab to next input box
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
//		pest text
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

	}

}








