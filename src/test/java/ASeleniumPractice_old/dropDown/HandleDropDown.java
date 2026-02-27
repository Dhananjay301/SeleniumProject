package ASeleniumPractice_old.dropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		//https://demoqa.com/select-menu
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropDown=driver.findElement(By.id("oldSelectMenu"));
		Select sel=new Select(dropDown);
		
		List<WebElement> colours=sel.getOptions();
		String target="Indigo";
		for(WebElement colour:colours) {
			String colr=colour.getText();
			if(colr.equals(target)) {
				System.out.println(target + " Is present");
			}
		}

	}

}
