package ASeleniumPractice_old.brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {
	WebDriver driver;
	int count=0;
	@Test(priority = 1)
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dependsOnMethods = { "setUp" })
	public void brokenLinks() throws IOException {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int allLinks = links.size();
		System.out.println("all Links= " + allLinks);
		
		try {
			for (WebElement linkElement : links) {
				String hrefValue = linkElement.getAttribute("href");
				if (hrefValue == null || hrefValue.isEmpty()) {
					System.out.println("Not possible to check links");
//					Continue;
				}
				URL linkUrl = new URL(hrefValue);
				HttpURLConnection conn = (HttpURLConnection) linkUrl.openConnection();
				conn.connect();
				if (conn.getResponseCode() >= 400) {
					System.out.println(hrefValue + " = Broken links");
					count++;
				} else {
					System.out.println(hrefValue + " = Not Broken Links");
				}
			}
		} catch (Exception e) {

		}
		System.out.println("Total Broken Links= "+count);
	}

}
