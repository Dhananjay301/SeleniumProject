package handleMultipleLinks;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultpleAtagLinksHandle {
	WebDriver driver;

	@Test(priority=0)
	void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	@Test(priority=1)
	void webElements() {
		List <WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("allLinks == "+allLinks.size());
		Set<String> uniqueLinks=new HashSet<>();
		
		for(WebElement links:allLinks) {
			String href=links.getAttribute("href");
			
			if(href !=null && !href.trim().isEmpty()) {
				uniqueLinks.add(href);
				}
		}
		System.out.println("uniqueLinks size=== "+uniqueLinks.size());
		for(String getAllLink:uniqueLinks) {
			System.out.println("getAllLink == "+getAllLink);

		}
	}

}
